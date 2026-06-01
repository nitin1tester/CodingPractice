package VibiumPractice;

import com.vibium.Vibium;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class helloVibium {

    public static void main(String[] args) throws IOException {

        // Launch a browser (you'll see it open!)
        var bro = Vibium.start();
        var vibe = bro.page();

        // Go to a website
        vibe.go("https://example.com");
        System.out.println("Loaded example.com");

        // Take a screenshot
        var png = vibe.screenshot();
        Files.write(Path.of("screenshot.png"), png);
        System.out.println("Saved screenshot.png");

        // Find and click the link
        var link = vibe.find("a");
        System.out.println("Found link: " + link.text());
        link.click();
        System.out.println("Clicked!");

        // Close the browser
        bro.stop();
        System.out.println("Done!");

    }

}

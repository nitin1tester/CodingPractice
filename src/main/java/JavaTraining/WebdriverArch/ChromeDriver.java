package JavaTraining.WebdriverArch;

public class ChromeDriver implements WebDriver {

    public ChromeDriver(){
        System.out.println("-----launching Chrome Browser----");
    }

    @Override
    public void get(String url) {
        System.out.println("We are entering URL");
    }

    @Override
    public String getTitle() {
        return "Amazon";
    }

    @Override
    public void findElement(String element) {
        System.out.println("Found element you are passing");
    }

    @Override
    public void click(String element) {
        System.out.println("Click on element you are passing " + element);
    }

    @Override
    public void sendKeys(String element, String value) {
        System.out.println("Enter the value to " +element + " with " + value);
    }

    @Override
    public void quit() {

    }
}

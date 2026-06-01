package JavaTraining.AbstractionConcept;

public class PageTest {
    public static void main(String[] args) {
        LoginPage lp = new LoginPage();
        lp.title();
        lp.url();
        lp.logo();
        lp.getTimeout();
        lp.doLogin();

        System.out.println("------------------------");

        // Top-casting

        Page pg = new LoginPage();
        pg.title();
        pg.getTimeout();
        pg.logo();
        pg.url();


    }
}

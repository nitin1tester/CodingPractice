package JavaTraining.AbstractionConcept;

public class LoginPage extends Page {

    public LoginPage(){
        super(10);
        System.out.println("Login Page default Const..");
    }


    @Override
    public void title() {
        System.out.println("loginpage - title");
    }

    @Override
    public void url() {
        System.out.println("LoginPage - url");
    }
    @Override
    public void logo(){
        System.out.println("Logo -- LoginPage");
    }

    public void doLogin(){
        System.out.println("LoginPage- doLogin");
    }

}

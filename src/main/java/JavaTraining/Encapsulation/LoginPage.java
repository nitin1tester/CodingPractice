package JavaTraining.Encapsulation;

public class LoginPage {

    private String  emailId;
    private String password;

    public void setEmailId(String emailId){
        if (emailId == null && emailId.length()>=10 && emailId.contains("@") && emailId.contains(".") && emailId.contains("@test.com")) {
            System.out.println("Email Can't be : "+ emailId);
        }

        this.emailId = emailId;
    }
    public String getEmailId(){
        return this.emailId;
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }


}

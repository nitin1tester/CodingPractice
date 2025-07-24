package EnumPractice.Designation;

public enum CurrentRole {

    // declare ENUM
    // intialize private variable for enum value.
    // create constructor for private variable
    // write getter methord for variable;

    QA(1), Tester(2), Dev(3), Product(4), Business(5);

    private final int currentRole;

    CurrentRole(int currentRole) {
        this.currentRole = currentRole;
    }

    public int getCurrentRole(){
        return this.currentRole;
    }


}

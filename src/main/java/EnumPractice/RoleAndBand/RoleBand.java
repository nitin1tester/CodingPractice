package EnumPractice.RoleAndBand;

import java.lang.module.FindException;

public enum RoleBand {

    /*
    1. First declare enum
    2. declare its private variable
    3. create constuctor & intialize values for variable
    4. create get methord for variable
    * */

    QA("Quality",1),
    DEV("Developer", 2),
    PM("Product manager", 3),
    LEAD("Tech lead", 4);

    private String Role;
    private int Band;

    RoleBand(String Role, int Band) {
        this.Role = Role;
        this.Band = Band;
    }

    public String getRole(){
        return this.Role;
    }
    public int getBand(){
        return this.Band;
    }
    public void setRole(String role){
        this.Role = role;
    }
    public void setBand(int band){
        this.Band = band;
    }




}



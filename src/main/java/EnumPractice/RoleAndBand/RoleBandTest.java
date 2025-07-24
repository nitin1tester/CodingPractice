package EnumPractice.RoleAndBand;

import javax.management.relation.Role;

public class RoleBandTest {

    public static void main(String[] args) {
        RoleBand roleBand = RoleBand.LEAD;
        System.out.println(roleBand.getBand());
        System.out.println(roleBand.getRole());
        System.out.println(roleBand);
    }

}

package JavaTraining.StringConcept;

public class StringBufferVsStringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append("Automation");
        System.out.println(sb);


        StringBuffer sbf = new StringBuffer("Hi");
        sbf.append("Cypress");
        System.out.println(sbf);

        String s = new String("Good");
        s.concat("morning");
        System.out.println(s);

    }

}

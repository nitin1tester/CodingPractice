package Basic_Part_I;

public class Problem6 {



    public int sum(Integer first,Integer second){

        return first+second;
    }

    public int multiply(Integer first,Integer second){
        return first*second;
    }

    public int subtract(Integer first,Integer second){
        return first-second;
    }

    public int divide(Integer first,Integer second){
        return first/second;
    }

    public static void main(String[] args){
        /*
        * 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
        *
        * */
        Problem6 obj = new Problem6();
        Integer fNum = 125;
        Integer lNum = 24;
        System.out.println(obj.sum(fNum,lNum));
        System.out.println(obj.multiply(fNum,lNum));
        System.out.println(obj.subtract(fNum,lNum));
        System.out.println(obj.divide(fNum,lNum));
    }
}

package NestedClassPractice;

public class Computer {

    public class Processor{
        public void displayDetails(){
            System.out.println("This is displayDetails methord");
        }
    }

    public void showProcessorDetails(){
        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showProcessorDetails();
    }


}

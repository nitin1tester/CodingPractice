package JavaTraining.InterfaceAbstractionConcept;

public interface USMedical extends WHO {

    // interface vars are static & final by default
    int min_fee = 100;

    // in interface we can't define the method body.
    // No method body , no method implementation.
    // Only method declearation - Only method prototype.
    // these are called Abstract methods

    public void physioService();
    public void oncologyService();
    public void dentalService();
    public void emergencyService();
    public void paymentMehtod(int amount);

    // after JDK 1.8 there are two major changes happen in interface
    // 1. We can have method body but it should be static method.
    static void medicalBilling(){
        System.out.println("US-Medical-Billing");
    }

    // 2. We can have a default method with method body (non static).
    default void medicalNews(){
        System.out.println("USM-medicalNews");
    }

}

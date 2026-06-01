package JavaTraining.InterfaceAbstractionConcept;

import com.beust.jcommander.IDefaultProvider;

public class ApolloHospital extends Medical implements USMedical,UKMedical, IndiaMedical {

    public final static int min_fee = 500;

    //US
    @Override
    public void physioService() {
        System.out.println("Apollo-physioService");
    }

    @Override
    public void oncologyService() {
        System.out.println("Apollo-oncologyService");
    }

    @Override
    public void dentalService() {
        System.out.println("Apollo-dentalService");
    }

    // Common
    @Override
    public void emergencyService() {
        System.out.println("Apollo-emergencyService");
    }

    @Override
    public void paymentMehtod(int amount) {
        System.out.println("US-payment " + amount);
    }

    // UK
    @Override
    public void orthoService() {
        System.out.println("Apollo-orthoService");
    }

    @Override
    public void neuroService() {
        System.out.println("Apollo-neuroService");
    }

    // Indian
    @Override
    public void cardioService() {
        System.out.println("Apollo-cardioService");
    }

    @Override
    public void gynocoService() {
        System.out.println("Apollo-gynocoService");
    }

    // Individuals
    public void uroService(){
        System.out.println("Apollo-uroService");
    }
    public void OPDService(){
        System.out.println("Apollo-OPD");
    }

    //method hiding
    public static void medicalBilling(){
        System.out.println("Apollo-medicalBilling");
    }

    @Override
    public void medicalNews(){
        System.out.println("Apollo-medicalNews");
    }

    public void medicalRND(){
        System.out.println("Apollo-RND");
    }

    @Override
    public void covidVacc() {
        System.out.println("Apollo - covidVacc");
    }
}


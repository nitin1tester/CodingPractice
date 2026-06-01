package JavaTraining.InterfaceAbstractionConcept;

import org.testng.annotations.Optional;

public class TestHospital {

    public static void main(String[] args) {
        ApolloHospital apolloHospital = new ApolloHospital();
        apolloHospital.physioService();
        apolloHospital.dentalService();
        apolloHospital.oncologyService();
        apolloHospital.cardioService();
        apolloHospital.gynocoService();
        apolloHospital.neuroService();
        apolloHospital.uroService();
        apolloHospital.OPDService();
        apolloHospital.orthoService();
        apolloHospital.emergencyService();
        USMedical.medicalBilling();
        ApolloHospital.medicalBilling();
        apolloHospital.medicalNews();
        apolloHospital.medicalRND();
        apolloHospital.covidVacc();

        System.out.println(ApolloHospital.min_fee);
        System.out.println(USMedical.min_fee);

        System.out.println("---------------------------------");
        USMedical usMedical = new ApolloHospital();
        usMedical.physioService();
        usMedical.dentalService();
        usMedical.oncologyService();
        usMedical.emergencyService();
        USMedical.medicalBilling();
        usMedical.medicalNews();
        usMedical.paymentMehtod(100);
        usMedical.covidVacc();

        System.out.println("---------------------------------");

        UKMedical ukMedical = new ApolloHospital();
        ukMedical.emergencyService();
        ukMedical.neuroService();
        ukMedical.orthoService();

        System.out.println("---------------------------------");

        IndiaMedical indiaMedical = new ApolloHospital();
        indiaMedical.cardioService();
        indiaMedical.gynocoService();
        indiaMedical.emergencyService();
    }


}

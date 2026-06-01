package JavaTraining.AbstractionConcept;

import JavaTraining.InterfaceAbstractionConcept.IndiaMedical;
import JavaTraining.InterfaceAbstractionConcept.UKMedical;
import JavaTraining.InterfaceAbstractionConcept.USMedical;

public abstract class Page {

    public Page(int count){
        System.out.println("I am page const.." + count);
    }
    public abstract void title();
    public abstract void url();
    public void getTimeout(){
        System.out.println("Timeout of 20 sec");
    }

    public void logo(){
        System.out.println("Logo -- Page");
    }
}

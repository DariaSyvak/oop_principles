package inheritance;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Tester extends Person {
    public Tester(){

    }
    public Tester(String name, String lastName, int age, String gender) {
        super(name, lastName, age, gender);
    }
    public void testing(){
        System.out.println("Tester testing");

    }
    public void eat(){
        System.out.println("Tester eats");

    }

    @Override
    public void sleep() {
        System.out.println("Tester sleeps");
    }

    @Override
    public void learn() {
        System.out.println("Tester learns");
    }

    @Override
    public void walk() {
        System.out.println("Tester walks");
    }
}

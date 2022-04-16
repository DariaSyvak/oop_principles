package inheritance;

public class Tester extends Person {
    public Tester(){

    }
    public Tester(String name, String lastName, int age, String gender) {
        super(name, lastName, age, gender);
    }
    public void testing(){
        System.out.println("Tester testing");
    }
}

package inheritance;

public class Dancer extends Person {
    public Dancer(){

    }
    public Dancer(String name, String lastName, int age, String gender) {
        super(name, lastName, age, gender);
    }
    public void dancing(){
        System.out.println("Dancer dancing");

    }
}


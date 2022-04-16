package package5;

import inheritance.Person;

public class Singer extends Person {
    public Singer(){

    }
    public Singer(String name, String lastName, int age, String gender) {
        super(name, lastName, age, gender);
    }

    public void sing(){
        System.out.println("Singer singing");
    }
}



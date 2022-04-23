package polymorphism;

import java.util.LinkedList;
import java.util.List;

public class TestPolymorphism {
    public static void main(String[] args) {
        System.out.println("TEST ANIMAL");
        Animal a1= new Animal();
        a1.sleep();
        a1.eat();

        System.out.println("TEST ANIMAL");

        Dog d1=new Dog();
        d1.eat();
        d1.sleep();
        d1.bark();
        d1.sleep(4);

        System.out.println("DOG IN ANIMAL SHAPE");
        Animal a2= new Dog();
        a2.sleep();
        a2.eat();
        a2.eat("food");


    }
}

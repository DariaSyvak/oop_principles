package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {
    public static void main(String[] args) {
        Cat cat1=new Cat();
        Dog dog1=new Dog();
        Animal animal1=new Animal();

        cat1.eat();
        cat1.sleep();
        cat1.eat("Fish");

        dog1.eat();
        dog1.sleep();
        dog1.eat("Meat");


        animal1.eat();
        animal1.eat("Food");
        animal1.sleep();

        System.out.println("\nCat and dog in Animal Shape\n");
        Animal c1=new Cat();
        c1.eat();
        c1.eat("fish");
        c1.sleep();

        Animal d1=new Dog();
        d1.eat();
        d1.sleep();
        d1.eat("meat");

        System.out.println("____________ARRAY COLLECTION____");
        Animal[]animals={cat1,dog1,c1,d1,animal1};
        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());

        }

        System.out.println("_______ARRAY LIST____________");
        //ArrayList<Animal>animal=new ArrayList<>(Arrays.asList(animals));
        new ArrayList<>(Arrays.asList(animals)).forEach(Animal::eat);

        }
    }


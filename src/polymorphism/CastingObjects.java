package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class CastingObjects {
    public static void main(String[] args){
        Cat cat1 =new Cat();


        Animal animal1=new Cat();//up-casting//smaller to bigger//implicitly
        Object object1=new Cat();
        List<Animal> animalList=new ArrayList<>();//up-casting ArrayList

        //Dog dog1= (Dog) new Animal();//down casting//explicitly
        //System.out.println(dog1);

        Animal a1=new Dog();
        Dog d1=(Dog) a1;//Down -casting

        a1.eat();
        d1.eat();




    }
}

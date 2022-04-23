package polymorphism;

public class Dog extends Animal{

    public void bark(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps");
    }

    public void sleep(int h) {
        System.out.println("Dog sleeps "+ h +" hours");
    }
}


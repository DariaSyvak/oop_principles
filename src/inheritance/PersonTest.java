package inheritance;

import package5.Singer;

import java.util.ArrayList;

public class PersonTest {
    public static void main(String[] args) {
        Person person1=new Person();
        Tester tester1=new Tester();
        Singer singer1=new Singer();
        Dancer dancer1=new Dancer();

        person1.name="John";
        person1.lastName="Doe";
        person1.age=45;
        person1.gender="Male";
        person1.setDOB("01/01/1977");
        person1.setSSN("000-00-0000");
        System.out.println(person1);

        tester1.name="Abe";
        tester1.lastName="Kim";
        tester1.age=20;
        tester1.gender="Male";
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");
        System.out.println(tester1);

        singer1.name="Kaly";
        singer1.lastName="Ngo";
        singer1.age=15;
        singer1.gender="Female";
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");
        System.out.println(singer1);

        dancer1.name="Alona";
        dancer1.lastName="Q";
        dancer1.age=15;
        dancer1.gender="Female";
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");
        System.out.println(dancer1);

        Person person2=new Person("Jane","Doe",45,"Male");
        person2.setSSN("555-55-5555");
        person2.setDOB("01/01/1977");
        Tester tester2=new Tester("Alona","Fomina",27,"Female");
        tester2.setSSN("555-55-5555");
        tester2.setDOB("01/01/1977");
        Singer singer2=new Singer("Leonid","Kuchman",26,"Male");
        singer2.setSSN("555-55-5555");
        singer2.setDOB("01/01/1977");
        Dancer dancer2=new Dancer("Daria","Syvak",28,"Female");
        dancer2.setSSN("555-55-5555");
        dancer2.setDOB("01/01/1977");

        System.out.println("PERSON ARRAY LIST");
        ArrayList<Person>personList=new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);
        personList.forEach(System.out::println);

        System.out.println("PERSON ARRAY");
        Person[]personArr={person2,singer2,dancer2,tester2};
        for (Person person : personArr) {
            System.out.println(person);

        }

        tester1.testing();
        dancer1.dancing();
        singer1.sing();
    }
}

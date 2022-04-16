package encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        Company comp1=new Company();
        Company comp2=new Company();

        comp1.setName("Apple");
        comp1.setAddress("California");
        comp1.setPhoneNumber("(123) 312-2345");

        System.out.println(comp1);

        comp2.setName("Google");
        comp2.setAddress("California");
        comp2.setPhoneNumber("(000) 055-5555");

        System.out.println(comp2);

        System.out.println("Company 1 is = \""+comp1.getName() +"\" and company 2 is =\"" +comp2.getName()+"\"");

    }
}

package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 =new Car();

        car1.make="BMW";//setting info for make
        System.out.println(car1.make);//Getting info of make


        car1.setYear(2020);//Setting info for year

        System.out.println(car1.getYear());//Getting info of year

        car1.setPrice(5000,"abcd1234");
        System.out.println(car1.getPrice());

        //car1.setPrice(4990,"Hello world");
        //System.out.println(car1.getPrice());

        System.out.println(car1.getIsConvertible());
    }
}

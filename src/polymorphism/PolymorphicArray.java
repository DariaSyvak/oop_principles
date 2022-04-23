package polymorphism;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.ArrayList;
import java.util.Scanner;

public class PolymorphicArray {
    public static void main(String[] args) {
        Object[]elements={5,10.5,'#',"Alex",true,new Cat(),new Scanner(System.in),new ArrayList<>(),new String[5]};
        for (Object element : elements) {
            System.out.println((element.getClass().getSimpleName()));
        }
        Dog d1=(Dog)elements[5];
        d1.bark();
        d1.sleep();

        String name=(String)elements[3];
        System.out.println(name.startsWith("A"));
    }
}

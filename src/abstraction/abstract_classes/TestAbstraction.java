package abstraction.abstract_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestAbstraction {


    public static void main(String[] args) {

        Samsung s1 = new Samsung("Samsung", "Black", 64, 700);
        Nokia n1 = new Nokia("Nokia", "Blue", 4, 100);
        Iphone i1 = new Iphone("Apple", "Silver", 128, 1000);

        List<Phone> phones = new ArrayList<>();
        phones.add(s1);
        phones.add(n1);
        phones.add(i1);

        for (Phone phone : phones) {
            System.out.println(phone);
        }

        int max = Integer.MIN_VALUE;
        Phone mostExp = null;
        for (Phone phone : phones) {
            if (phone.price > max) mostExp = phone;
        }
        System.out.println("The most expensive = " + mostExp.getClass().getSimpleName());
        System.out.println("The color for most exp = "+ mostExp.color);

        int conv = 0;
        for (Phone phone : phones) {
            if (phone.isConvertible()) conv++;
        }
        System.out.println("Convertible phones = " + conv);

        System.out.println(Iphone.OS);
        System.out.println(Samsung.OS);
        System.out.println(Nokia.OS);

    }



}

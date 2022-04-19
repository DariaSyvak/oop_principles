package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.taste = "delisios";
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1.name);
        System.out.println(food1.isOrganic());
        System.out.println(food1);

        Vegetable food2 = new Vegetable();
        food2.taste = "good";
        food2.name = "parsley";
        food2.isSpicy = false;
        food2.setOrganic(true);
        food2.color = "green";

        System.out.println(food2.name + "," + food2.color);
        System.out.println(food2.isOrganic());
        System.out.println(food2);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";
        System.out.println(vegetable2);

        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(food2);
        allFoods.add(vegetable2);

        int c = 0;
        for (Food allFood : allFoods) {
            if (allFood.name.length() > 5) c++;

        }
        System.out.println(c);

        System.out.println("BONUS SOLUTION");
        System.out.println(allFoods.stream().filter(food -> food.name.length() > 5).count());
    }
}

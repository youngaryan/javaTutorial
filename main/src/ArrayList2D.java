import java.util.*;
public class ArrayList2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String >> menu = new ArrayList<ArrayList<String>>();

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("Halim");
        food.add("Cheese");

        ArrayList<String> appetiser = new ArrayList<String>();
        appetiser.add("yoghurt");
        appetiser.add("hamous");
        appetiser.add("soup");
        appetiser.add("spinach");

        menu.add(appetiser);
        menu.add(food);

        System.out.println(menu.get(1).get(3));
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(menu.get(i));
        }

    }
}

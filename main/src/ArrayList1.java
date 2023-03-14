import java.util.ArrayList;
public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("burger");
        food.add("Halim");
        food.add("Cheese");
        food.set(0,"Sushi");
        for (int i = 0; i < food.size() ; i++) {
            System.out.println(food.get(i));
        }

    }
}

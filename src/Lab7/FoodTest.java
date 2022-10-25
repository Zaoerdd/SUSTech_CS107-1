package Lab7;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food pizza1 = new Food();
        Food pizza2 = new Food();
        Food friedRice = new Food();
        Food noodles = new Food();

        pizza1.setId(1);
        pizza1.setName("pizza");
        pizza1.setType("Seafood");
        pizza1.setSize(11);
        pizza1.setPrice(12);

        pizza2.setId(2);
        pizza2.setName("pizza");
        pizza2.setType("Beef");
        pizza2.setSize(9);
        pizza2.setPrice(10);

        friedRice.setId(3);
        friedRice.setName("fried rice");
        friedRice.setType("Seafood");
        friedRice.setSize(5);
        friedRice.setPrice(12);

        noodles.setId(4);
        noodles.setName("noodles");
        noodles.setType("Beef");
        noodles.setSize(6);
        noodles.setPrice(14);

        ArrayList<Food> foodList= new ArrayList<Food>();
        foodList.add(pizza1);
        foodList.add(pizza2);
        foodList.add(friedRice);
        foodList.add(noodles);

        System.out.println("-------------------------------------Menu--------------------------------------");
        for (int i = 0;i<foodList.size(); i++){
            foodList.get(i).showInformation();
        }
        System.out.println("-------------------------------------Menu--------------------------------------");
    }
}

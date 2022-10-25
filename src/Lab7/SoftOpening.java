package Lab7;

import java.util.ArrayList;
import static Lab7.Main.in;

public class SoftOpening {
    public static ArrayList<Food> generateMenu(){
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

        return foodList;
    }

    public static void getMenu(ArrayList<Food> foodList){
        System.out.println("-------------------------------------Menu--------------------------------------");
        for (Food food : foodList) {
            food.showInformation();
        }
        System.out.println("-------------------------------------Menu--------------------------------------");

    }

    public static User generateUser(){
        User user1 =new User();
        System.out.print("Generate a user, please input name: ");
        user1.setUser(in.next());
        System.out.print("Balance($): ");
        user1.setMoney(in.nextDouble());

        user1.setPassword("123456");
        return user1;
    }

    public static void userConsume(ArrayList<Food> foodList, User user){
        getMenu(foodList);
        System.out.println("Please input the foodID and the number you want, to exit input 0");
        System.out.print("Food id (input 0 to end select):");
        int id = in.nextInt();
        double price = 0;
        while (id != 0){
            System.out.print("Numbers of this food: ");
            int numbers = in.nextInt();
            price += foodList.get(id-1).getPrice()*numbers;
            System.out.print("Food id (input 0 to end select):");
            id = in.nextInt();
        }
        System.out.println("Select end");
        user.withdraw(price);
    }
}

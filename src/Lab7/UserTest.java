package Lab7;

public class UserTest {
    public static void main(String[] args) {
        User user =new User();
        user.setUser("Lucy");
        user.setPassword("123456");
        user.setMoney(1000);
        user.introduce();
        user.withdraw(2000);
        user.withdraw(500);
        user.deposit(1000);
        user.introduce();
    }
}

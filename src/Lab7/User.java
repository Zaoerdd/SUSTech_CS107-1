package Lab7;

import java.util.Scanner;

public class User {
    private String account;
    private String password;
    private double money;

    public void setUser(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private boolean match(String password) {
        return (password.equals(this.password));
    }

    public void introduce() {
        System.out.printf("%s's account has a balance of %.2f dollar\n", account, money);
    }

    public void deposit(double money){
        System.out.printf("Got %.2f as income, balance is %.2f dollar\n", money, this.money+money);
        this.money += money;
    }

    public void withdraw(double money) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Plan to withdraw %.2f dollar, ", money);
        if (money > this.money) {
            System.out.println("but no sufficient balance");
        } else {
            System.out.println("okay");
            boolean flag = false;
            for (int i = 2; i >= 0; i--) {
                if (!flag){
                    System.out.println("Please input your password");
                    String password = input.next();
                    if (match(password)) {
                        System.out.printf("Withdraw %.2f dollar and balance is %.2f dollar\n", money, this.money - money);
                        this.money -= money;
                        flag = true;
                    }
                    else{
                        System.out.printf("password error, there are %d times left to try\n", i);
                    }
                }
            }
        }
    }
}

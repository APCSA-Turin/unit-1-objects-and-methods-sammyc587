import java.util.Scanner;
public class ExactChange {
    public static void main(String[] args) {
        Scanner change = new Scanner(System.in);
        System.out.println("Please enter an amount in dollars and cents: ");
        double amount = change.nextDouble();
        int quarters = (int) (amount / .25);
        double leftOver = amount - quarters * .25;
        System.out.println(leftOver);
        int dimes = (int) (leftOver /.1);
        double leftOver2 = leftOver - dimes*.1;
        System.out.println(leftOver2);
        int nickels = (int) (leftOver2 / .05);
        double leftOver3 = leftOver2 - nickels * .05;
        System.out.println(leftOver3);
        int pennies = (int) (leftOver3 / .01);
        int total = (int) (quarters + dimes + nickels + pennies);
        System.out.println("The minimum number of coins is: " + total);
        System.out.println(quarters + "quarters");
        System.out.println(dimes + "dimes");
        System.out.println(nickels + "nickels");
        System.out.println(pennies + "pennies");

        
    }
}
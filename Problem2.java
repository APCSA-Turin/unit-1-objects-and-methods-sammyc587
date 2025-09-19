import java.util.Scanner;
public class Problem2{
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Player 1, enter your name: ");
        String name1 = name.nextLine();
        System.out.println("Enter your number: ");
        double number1 = name.nextDouble();
        System.out.println("Player 2, enter your name: ");
        String name2 = name.nextLine();
        name.nextLine();
        System.out.println("Enter your number: ");
        double number2 = name.nextDouble();
        if(number2<number1){
        System.out.println(name1 + "'s number is bigger!");
        }else if(number2>number1){
            System.out.println(name2 + "'s number is bigger!");
        }else {
            System.out.println("The numbers are equal!");
        }


    }
}

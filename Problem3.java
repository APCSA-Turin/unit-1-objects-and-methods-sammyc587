import java.util.Scanner;
public class Problem3{
    public static void main(String [] args){
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a 3-digit number: ");
        int digits = number.nextInt();
        number.nextLine();
        int hundreds = digits / 100; 
        int tens = (digits/10)%10;
        int ones = digits%10;
        System.out.println("The reverse of " + digits + " is " + ones + tens + hundreds);
    }
}
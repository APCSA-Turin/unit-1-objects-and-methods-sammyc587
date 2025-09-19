import java.util.Scanner;
public class Freestyle {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double burger = 5.5;
        double fries = 4; 
        double total = 0;
        System.out.println("Menu: Burger       5.50");
        System.out.println("      Small Fries  2.5");
        System.out.println("      Large Fries  5.5");
        System.out.println("What would you like to order today?: ");
        String order = num.nextLine();
        num.nextLine();
        if(order.equals(burger)){
            total += burger;
        }else if(order.equals (fries)){
            total+= fries;
        }
        System.out.println("What would you like to order today?: " + total);
        String order2 = num.nextLine();
        num.nextLine();
        }
        
    }

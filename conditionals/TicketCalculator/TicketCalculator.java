import java.util.*;

public class TicketCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int price = 350;

        System.out.print("Enter the number of tickets for people under 12 years :- ");
        int under12 = sc.nextInt();

        System.out.print("Enter the number of tickets for people under 65 :-");
        int under65 = sc.nextInt();

        System.out.print("Enter the number of tickedts for people over the age of 65 :-");
        int over65 = sc.nextInt();

        double total = ((price * .5) * under12) + (price * under65) + ((price *.3) * over65);

        System.out.println("The total of (under 12) " + under12 +" ticket is " + ((price * .5) * under12));
        System.out.println("The total of (under 65) " + under65 +" ticket is " + (price  * under65));
        System.out.println("The total of (over 65) " + over65 +" ticket is " + ((price * .3) * over65));

        System.out.println("The total price for the tickets is " + total);
    
    
    }
}
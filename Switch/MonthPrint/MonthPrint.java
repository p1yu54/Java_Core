import java.util.Scanner;

public class MonthPrint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your month number :- ");
        int input = sc.nextInt();

        switch (input) {
            case 1:
                System.out.println("This month is Janruary");
                break;
            
            case 2:
                System.out.println("This month is February");
                break;

            case 3:
                System.out.println("This month is March");
                break;

            case 4:
                System.out.println("This month is April");
                break;

            case 5:
                System.out.println("This month is May");
                break;

            case 6:
                System.out.println("This month is June");
                break;

            case 7:
                System.out.println("This month is July");
                break;

            case 8:
                System.out.println("This month is August");
                break;

            case 9:
                System.out.println("This month is September");
                break;

            case 10:
                System.out.println("This month is October");
                break;

            case 11:
                System.out.println("This month is November");
                break;

            case 12:
                System.out.println("This month is December");
                break;
                
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

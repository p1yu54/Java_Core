import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Addition / Subtraction / Multiplication / Division");
        System.out.print("Enter your function :-");
        String function = sc.next();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        switch (function) {
            case "Addition":
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            
            case "Subtraction":
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case "Multiplicaiton":
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case "Division":
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;

            default:
                System.out.print("Input funtion is invalid");
                break;
        }
    }    
}

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        switch (num % 2 ) {
            case 0:
                System.out.println(num + " is an even number");
                break;
        
            default:
                System.out.println(num + " is an odd number");
                break;
        }
    }    
}

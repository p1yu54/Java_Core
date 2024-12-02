import java.util.Scanner;

public class MaleFemale {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your gender (M/F) :- ");
        char input = sc.next().charAt(0);

        switch (input) {
            case 'M':
                System.out.println("You are a Male");
                break;
            case 'F':
                System.out.println("You are a Female");
                break;

            default:
                System.out.println("Invalid input");
                break;
        }
    }    
}

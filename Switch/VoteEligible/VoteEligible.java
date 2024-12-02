import java.util.Scanner;

public class VoteEligible{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :- ");
        int age = sc.nextInt();

        int flag = 0;

        flag = (age >= 18) ?  1 : 0;

        switch (flag) {
            case 1:
                System.out.print("You are eligible to vote");
                break;
        
            default:
                System.out.println("You are not eligible to vote");
                break;
        }
    }
}
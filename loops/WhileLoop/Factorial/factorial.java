import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();

        int idx = 1 , fact = 1;

        while(idx <= num ){
            fact = fact * idx;
            idx++;
        }
        System.out.println("The factorial of " + num  +" is " + fact);
    }
}

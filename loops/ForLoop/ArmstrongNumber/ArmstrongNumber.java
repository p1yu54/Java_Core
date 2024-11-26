import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();
        
        int temp = num;
        int sum = 0;

        while(temp != 0){
            int rem = temp % 10;
            sum += rem * rem * rem;
            temp /= 10;
        }
        if(sum == num){
            System.out.println(num + " is a Armstrong Number");
        }
        else{
            System.out.println(num + " is not a Armstrong Number");
        }
    }    
}

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();

        int temp = num;
        int rev  = 0;

        for (temp = num; temp != 0; temp /= 10) {
            int digit = temp % 10;          
            rev = rev * 10 + digit; 
        }
        if(rev == num){
            System.out.println(num + " is a Palindrome Number");
        }
        else{
            System.out.println(num + " is not a Palindrome Number");
        }
    }
}

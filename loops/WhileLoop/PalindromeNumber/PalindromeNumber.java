import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();

        int rev = 0, temp;
        temp = num;

        if(num > 0){
            while(num != 0){
                rev = (rev * 10) + (num % 10);
                num /= 10;
            }
            if(rev == temp){
                System.out.print(temp + " is a Palindrome Number");
            }
            else{
                System.out.println(temp + " is not a Palindrome number");
            }
        }
        else{
            System.out.println("Input is invalid");
        }
    }
}

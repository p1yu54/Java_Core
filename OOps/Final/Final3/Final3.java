// Making a Final class a final method in the class and accessing the method (with passing parameters) in main method

import java.util.Scanner;

final class A{
    final void isPalindrome(int num){
        int rev = 0;
        for(int temp = num ; temp != 0 ; temp /= 10){
            rev = (rev * 10) + (temp % 10);
        }
        if(num == rev){
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }
}

public class Final3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        a.isPalindrome(num);
    }
}

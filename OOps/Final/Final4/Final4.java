// Making final method to add two numbers in a final class 

import java.util.Scanner;

final class A{
    final void sum(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

public class Final4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();


        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        a.sum(num1, num2);
    }
}

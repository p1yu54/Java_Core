// Making final method sum that will return the sum of two numbers(with passing paameters) in a final class 

import java.util.Scanner;

final class A{
    final int sum(int num1 , int num2){
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        return sum;
    }
}

public class Final6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(a.sum(num1,num2));
    }
}

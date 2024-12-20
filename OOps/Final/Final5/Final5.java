// Making final method sum that will return the sum of two numbers in a final class 

import java.util.Scanner;

final class A{
    final int sum(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        return sum;
    }
}

public class Final5 {
    public static void main(String[] args) {
        System.out.println(new A().sum());
    }
}

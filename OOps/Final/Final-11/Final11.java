// Making non-final method that will print as well as return the sum of two numbers(with passing parameters) inside a final class

import java.util.Scanner;

final class Calculator{
    void add(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}

public class Final11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        c.add(num1, num2);
    }
}

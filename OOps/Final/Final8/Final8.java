// Making a non-final method that will print the sum of two numbers in an another final class

import java.util.Scanner;

final class A{
    void add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}

public class Final8{
    public static void main(String[] args) {
        new A().add();
    }
}
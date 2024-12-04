// Making methods that will do addition , subtraction , multiplication , division , modulous and as well as returning their respective solution

import java.util.Scanner;

class Calculator{
    int add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        return (num1 + num2);
    }

    int subtract(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        return (num1 - num2);
    }

    int multiply(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        return (num1 * num2);
    }

    double divide(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        return (num1 / num2);
    }

    double mod(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        return (num1 % num2);
    }
}
public class ClassMethod2 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("The sum = " + c.add());
        System.out.println("The subtraction = " + c.subtract());
        System.out.println("The multiplication = " + c.multiply());
        System.out.println("The division = " + c.divide());
        System.out.println("The modulous =" + c.mod());
    }  
}

// Making different classes For addition , subtraction , multiplicaton , division and performing calculation in their constructor

import java.util.Scanner;

class Add{
    Add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
} 
class Subtract{
    Subtract(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}

class Multiply{
    Multiply(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.println(num1 + "* " + num2 + " = " + (num1 * num2));
    }
}

class Divide{
    Divide(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
public class Encapsulation4 {
    public static void main(String[] args) {
        new Add();
        new Subtract();
        new Multiply();
        new Divide();
    }
}

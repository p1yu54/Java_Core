// Making basic calculator's funciton mehtods in other class 

import java.util.Scanner;

class A{
    void add(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }

    void subtract(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }

    void multiply(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }

    void divide(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

    }

    void mod(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

    }
}

public class Basics2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        A a = new A();

        System.out.print("Enter your function :- ");
        String function = sc.next();

        if(function.equalsIgnoreCase("add")){
            a.add();
        }
        else if(function.equalsIgnoreCase("subtract")){
            a.subtract();;
        }
        else if(function.equalsIgnoreCase("multiply")){
            a.multiply();
        }
        else if(function.equalsIgnoreCase("divide")){
            a.divide();
        }
        else if(function.equalsIgnoreCase("mod")){
            a.mod();
        }
        else{
            System.out.println("Ivalid input");
        }
    }
}
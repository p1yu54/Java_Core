// Making basic calculator's funciton mehtods in other class with argument in methods

import java.util.Scanner;

class A{
    void add(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
    void sub(int num1 , int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
    void multiply(int num1 , int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
    void divide(int num1 , int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
    void mod(int num1 , int num2){
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
public class Basics5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A a = new A();

        System.out.print("Enter your function :- ");
        String function = sc.next();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        if(function.equalsIgnoreCase("add")){
            a.add(num1 , num2);
        }
        else if(function.equalsIgnoreCase("subtraction")){
            a.sub(num1, num2);
        }
        else if(function.equalsIgnoreCase("multiplication")){
            a.multiply(num1, num2);
        }
        else if(function.equalsIgnoreCase("divide")){
            a.divide(num1, num2);
        }
        else if(function.equalsIgnoreCase("mod")){
            a.mod(num1, num2);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

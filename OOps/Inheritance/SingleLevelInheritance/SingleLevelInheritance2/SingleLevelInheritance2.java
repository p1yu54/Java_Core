// Making a class and making two method add and subtract and passing it to another class and making multiply and divide methods in the child class

import java.util.Scanner;

class A{
    void add(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    void subtract(int num1 , int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}
class B extends A{
    void multiply(int num1 , int num2){
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    void divide(int num1 , int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
public class SingleLevelInheritance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        B b = new B();

        System.out.print("Enter your function :- ");
        String input = sc.next();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        if(input.equalsIgnoreCase("add")){
            b.add(num1,num2);
        }
        else if(input.equalsIgnoreCase("subtract")){
            b.subtract(num1, num2);
        }
        else if(input.equalsIgnoreCase("multiply")){
            b.multiply(num1, num2);
        }
        else if(input.equalsIgnoreCase("divide")){
            b.divide(num1, num2);
        }
        else{
            System.out.println("Invalid input");
        }
    }    
}

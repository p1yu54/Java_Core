// Making methods for functions like addtition , subtraction , multiplication , divsion and mod (with passing argument and returning their solution)

import java.util.Scanner;

class Calculator{
    int add(int num1 , int num2){
        return (num1 + num2);
    }
    int subtraction(int num1 , int num2){
        return(num1 - num2);
    }
    int multiplication(int num1 , int num2){
        return (num1 * num2);
    }
    int divsion(int num1 , int num2){
        return (num1 / num2);
    }
    int mod(int num1 , int num2){
        return (num1 % num2);
    }
}
public class ClassMethod6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println("Addition = " + c.add(num1 , num2));
        System.out.println("Subtraction = " + c.subtraction(num1 , num2));
        System.out.println("Multiplication = " + c.multiplication(num1 , num2));
        System.out.println("Division = " + c.divsion(num1 , num2));
        System.out.println("Modulous = " + c.mod(num1 , num2));
    }
}

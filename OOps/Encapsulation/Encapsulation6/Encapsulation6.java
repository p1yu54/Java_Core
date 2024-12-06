// Making and calling the constructor of antoher class as well as performing the sum of two numbers by passing numbers as arguments

import java.util.Scanner;

class Add{
    Add(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
public class Encapsulation6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        new Add(num1 , num2);
    }
}

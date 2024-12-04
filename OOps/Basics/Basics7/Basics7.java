//Making multiple class for method like addition  , subtraction , multiplication , division

import java.util.Scanner;

class Addition{
    void add(int num1 , int num2){

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}

class Subtraction{
    void subtraction(int num1 , int num2){

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }
}

class Multiplication{
    void multiplication(int num1 , int num2){

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }
}

class Division{
    void division(int num1 , int num2){

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

    }
}

class Mod{
    void Modulous(int num1 , int num2){

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}

public class Basics7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Mod mo = new Mod();


        System.out.print("Enter your function :- ");
        String input = sc.next();

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();
        
        if(input.equalsIgnoreCase("add")){
            a.add(num1 ,num2);
        }
        else if(input.equalsIgnoreCase("subtraction")){
            s.subtraction(num1 ,num2);
        }
        else if(input.equalsIgnoreCase("multiplication")){
            m.multiplication(num1 ,num2);
        }
        else if(input.equalsIgnoreCase("division")){
            d.division(num1 ,num2);
        }
        else if(input.equalsIgnoreCase("mod")){
            mo.Modulous(num1, num2);
        }
        else{
            System.out.println("Invalid input");
        }
    }    
}
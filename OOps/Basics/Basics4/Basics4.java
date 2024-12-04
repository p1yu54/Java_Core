//Making multiple class for method like addition  , subtraction , multiplication , division

import java.util.Scanner;

class Addition{
    void add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}

class Subtraction{
    void subtraction(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));

    }
}

class Multiplication{
    void multiplication(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

    }
}

class Division{
    void division(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

    }
}

class Mod{
    void Mod(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}

public class Basics4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        Mod mo = new Mod();


        System.out.print("Enter your function");
        String input = sc.next();

        if(input.equalsIgnoreCase("add")){
            a.add();
        }
        else if(input.equalsIgnoreCase("subtraction")){
            s.subtraction();
        }
        else if(input.equalsIgnoreCase("multiplication")){
            m.multiplication();
        }
        else if(input.equalsIgnoreCase("division")){
            d.division();
        }
        else if(input.equalsIgnoreCase("mod")){
            mo.Mod();
        }
        else{
            System.out.println("Invalid input");
        }
    }    
}

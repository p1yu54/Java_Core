// Making different constructors to perform addition , subtraction , multiplication , division

import java.util.Scanner;

class Add{
    Add(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
} 
class Subtract{
    Subtract(int num1 , int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}

class Multiply{
    Multiply(int num1 , int num2){
        System.out.println(num1 + "* " + num2 + " = " + (num1 * num2));
    }
}

class Divide{
    Divide(int num1 , int num2){
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
public class Encapsulation7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your function :- ");
        String input = sc.next();

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        if(input.equalsIgnoreCase("add")){
            new Add(num1 ,num2);
        }
        else if(input.equalsIgnoreCase("sub")){
            new Subtract(num1, num2);
        }
        else if(input.equalsIgnoreCase("multiply")){
            new Multiply(num1, num2);
        }
        else if(input.equalsIgnoreCase("divide")){
            new Divide(num1, num2);
        }
        else{
            System.out.println("Invalid input");
        }


    }
}
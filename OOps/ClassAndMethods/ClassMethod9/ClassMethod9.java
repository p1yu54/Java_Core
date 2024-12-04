// Making covariant returning method for functions like addition , subtraction , multiplication , divisiom . mod (with passing arguments as well as returning their solutions)

import java.util.Scanner;

class Add{
    Add add(int num1 , int num2){
        System.out.println(num1 + num2);
        return this;
    }
}

class Sub{
    Sub sub (int num1 , int num2){
        System.out.println(num1 - num2);
        return this;
    }
}

class Multiply{
    Multiply multiply(int num1 , int num2){
        System.out.println(num1 * num2);
        return this;
    }
}

class Divide{
    Divide divide(int num1 , int num2){
        System.out.println(num1 * num2);
        return this;
    }
}

class Mod{
    Mod mod(int num1 , int num2){
        System.out.println(num1 % num2);
        return this;
    }
}
public class ClassMethod9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add a = new Add();
        Sub s = new Sub();
        Multiply m = new Multiply();
        Divide d = new Divide();
        Mod mo = new Mod();

        System.out.print("Enter your function :- ");
        String input = sc.next();


        System.out.print("Enter the value of num1 :- ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        if(input.equalsIgnoreCase("add")){
            System.out.println(a.add(num1, num2));
        }
        else if(input.equalsIgnoreCase("sub")){
            System.out.println(s.sub(num1, num2));
        }
        else if(input.equalsIgnoreCase("multiply")){
            System.out.println(m.multiply(num1, num2));
        }
        else if(input.equalsIgnoreCase("divide")){
            System.out.println(d.divide(num1, num2));
        }
        else if(input.equalsIgnoreCase("mod")){
            System.out.println(mo.mod(num1, num2));
        }
        else{
            System.out.println("Invalid input");
        }
    }
}

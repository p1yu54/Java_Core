// Making and accessing abstract method from an abstract to a non-abstract class as well as applying the concept of user input in it
import java.util.Scanner;

abstract class A{
    abstract void show(int a);
}
class B extends A{
    void show(int num1){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " = " + (num1 + num2));
    }
}
public class Abstraction10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        B p = new B();
        p.show(num1);

    }    
}

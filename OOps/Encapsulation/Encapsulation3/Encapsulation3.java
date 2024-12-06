// Making and calling the constructor of another class as well as the calculating the sum of two number inside the constructor

import java.util.Scanner;

class Add{
    Add(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :- ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " =  + " + (num1 + num2));
    }
}
public class Encapsulation3 {
    public static void main(String[] args) {
        new Add();
    }
}

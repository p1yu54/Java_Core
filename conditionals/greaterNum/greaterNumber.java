import java.util.*;
public class greaterNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is the largest number");
        }
        else if(num2 > num1){
            System.out.println(num2 + " is the largest number");
        }
        else{
            System.out.println("Both numbers are equal");
        }
    }
}
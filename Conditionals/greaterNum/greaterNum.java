//Q1  Greater numbers between three numbers
/* 
*/

//Q2 Greater number betweem 5 numbers;
/* 
import java.util.*;
public class greaterNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        System.out.print("Enter the value of num3 :-");
        int num3 = sc.nextInt();

        System.out.print("Enter the value of num4 :-");
        int num4 = sc.nextInt();

        System.out.print("Enter the value of num5 :-");
        int num5 = sc.nextInt();

        if((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)){
            System.out.println(num1 + " is the largest number");
        }
        else if((num2 >  num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)){
            System.out.println(num2 + "is the largest number");
        }
        else if((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
            System.out.println(num3 + " is the largest number");
        }
        else if((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)){
            System.out.println(num4 + " is the largest number");
        }
        else if((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4)){
            System.out.println(num5 + " is the largest number");
        }
        else{
            System.out.println("All entered numbers are equal");
        }

    }
}
*/
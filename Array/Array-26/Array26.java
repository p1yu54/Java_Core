// Printing the factorial of every element in an array 

import java.util.Scanner;

public class Array26 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at index " + (i+1) + " of your array :- ");
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void factorialPrint(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
    public static void main(String[] args) {
        int a[] = inputArray();

        for(int i = 0 ; i < a.length ; i++){
            factorialPrint(a[i]);
        }
    }
}

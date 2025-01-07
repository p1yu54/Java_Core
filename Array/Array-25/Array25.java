// Printing table of every element in array

import java.util.Scanner;

public class Array25 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the value at index " + (i+1) + " of your array :- ");
            a[i] = sc.nextInt();
        }
        return a;
    } 

    public static void tablePrint(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[] = inputArray();

        for(int i = 0 ; i < a.length ; i++){
            tablePrint(a[i]);
        }
    }
}

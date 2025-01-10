// Updating the value at particular index in an array 

import java.util.Scanner;

public class Array35 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i = 0 ; i < a.length ; i++){
            System.out.print("Enter the element at the index " + i + " of your array :- ");
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = inputArray();

        System.out.println();
        
        System.out.print("Enter the index you want to change :- ");
        int index = sc.nextInt();

        System.out.print("Enter the value you want to update :- ");
        int update = sc.nextInt();

        System.out.println();

        System.out.println("Before Updating :- ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }

        a[index] = update;

        System.out.println();

        System.out.println("After Updating :- ");
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}

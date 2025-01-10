// finding duplicate numbers in an array

import java.util.Scanner;

public class Array33 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int a[] = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at the index " + (i+1) + " in your array :- ");
            a[i] = sc.nextInt();
        }

        return a;
    }
    public static void main(String[] args) {
        
        int a[] = inputArray();

        System.out.println("The dupicate numbers in your array are :- ");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = i+1 ; j < a.length ; j++){
                if(a[i] == a[j]){
                    System.out.println(a[i]);
                }
            }
        }
    }
}

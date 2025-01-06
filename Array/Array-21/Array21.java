// Swapping first and last index of the array

import java.util.*;
public class Array21 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at " + (i+1) + " of your array :- ");
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }

    public static void printn(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int arr[]){
       int temp = arr[0];
       arr[0] = arr[arr.length - 1];
       arr[arr.length - 1] = temp;
    }
    public static void main(String[] args) {
        int arr[] = inputArray();   
        
        System.out.println("Before swapping :- ");
        printn(arr);

        swap(arr);

        System.out.println("After swapping :- ");
        printn(arr);
    }
}

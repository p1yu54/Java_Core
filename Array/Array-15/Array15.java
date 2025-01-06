// Counting the total number of elements in an array

import java.util.Scanner;

public class Array15{
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
    public static void main(String[] args) {
        int arr[] = inputArray();
        int count  = 0 ;
        for(int i : arr){
            count++;
        }
        System.out.print("The number if elements in your array is :- " + count);
    }
}
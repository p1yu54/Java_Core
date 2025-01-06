// Calculating the sum of all the elements of an array

import java.util.Scanner;

public class Array16 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at " + (i+1) + " of your array :- ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }
    public static void main(String[] args){
        int arr[] = inputArray();
        int sum = 0;
        
        for(int i : arr){
            sum += i;
        }

        System.out.println(sum);
    }
}

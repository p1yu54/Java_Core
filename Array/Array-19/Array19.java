// Adding to arrays

import java.util.Scanner;

public class Array19 {
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

    public static void add(int arr1[] , int arr2[]){
        int size ;
        if(arr1.length == arr2.length){
            size = arr1.length;
        }
        else if(arr1.length > arr2.length){
            size = arr1.length;
        }
        else{
            size = arr2.length;
        }

        int sum[] = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            sum[i] = arr1[i] + arr2[i];
        }

        for(int i = 0 ; i < size ; i++){
            System.out.print(sum[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr1[] = inputArray();
        int arr2[] = inputArray();

        add(arr1, arr2);
    }
}

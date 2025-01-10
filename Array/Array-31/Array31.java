// finding the minimum element in an array

import java.util.*;

public class Array31 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at the index " + (i+1) + " of your array :- ");
            arr[i] = sc.nextInt();
        }

        return arr;
    }

    public static void main(String[] args) {
        int a[] = inputArray();
        
        int max = a[0];

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] < max){
                max = a[i];
            }
        }

        System.out.println("The maximum number of your array is " + max);
    }
}

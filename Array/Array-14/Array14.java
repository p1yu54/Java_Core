// Checking for neon numbers in an array

import java.util.Scanner;

public class Array14 {
    // for the input of the array 
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at "+ (i+1) + " for your arrary :- ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // to check if there is any neon number present in the array
    public static void isNeon(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            int rem = 0 , res = 0;
            int square = (arr[i] * arr[i]);
            for(int temp = square ; temp != 0 ; temp /= 10){
                rem = temp % 10;
                res += rem;
            }
            if(arr[i] == res){
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = inputArray();
        isNeon(arr);
    }    
}

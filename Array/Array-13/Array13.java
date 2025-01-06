// Checking for prime numbers in an array

import java.util.Scanner;

public class Array13{
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements of the array :- ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        
        //for taking the input of elements in the array
        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the value of " + (i+1) + " element :- ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void isPrime(int arr[]){
        System.out.println("The prime numbers in the array are :- ");
        for(int i = 0 ; i < arr.length ; i++){
            boolean flag = true;
            for(int j = 2 ; j < arr[i] ; j++){
                if(arr[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = inputArray();
        isPrime(arr);
    }
}

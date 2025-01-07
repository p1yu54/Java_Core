// check for the user input number if present in the array

import java.util.Scanner;

public class Array18 {
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

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int input = sc.nextInt();

        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == input){
                flag = true;
                break; 
            }            
        }
        if(flag){
            System.out.println(input + " is present in the array");
        }
        else{
            System.out.println(input + " is not present in the array");
        }
    }
}
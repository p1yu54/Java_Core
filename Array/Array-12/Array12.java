// Checking for armstorng number in an array

import java.util.Scanner;

public class Array12 {
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
    public static void printn(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void isArmstrong(int arr[]){
        System.out.println("The Armstrong numbers in the array are :- ");
        for(int i = 0 ; i < arr.length ; i++){
            int count = 0 , power = 1 , rem = 0 , check = 0;
            for(int temp = arr[i] ; temp != 0 ; temp /= 10){
                count++;
            }
            for(int temp = arr[i] ; temp != 0 ; temp /= 10){
                rem = temp % 10 ;
                power = 1; 
                for(int j = 1 ; j <= count ; j++){
                    power *= rem ;
                }
                check += power;
            }
            if(arr[i] == check){
                System.out.print(arr[i] + " ");
            }
        }
    }
    
    public static void main(String[] args){
        int arr[] = inputArray();
        isArmstrong(arr);       
    }    
}

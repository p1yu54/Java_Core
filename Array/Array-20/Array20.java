// Converting an array to a number and finding the sum of first and last digit of the number

import java.util.Scanner;

public class Array20 {
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
        
        int num = 0;

        // converting array into a number
        for(int i : arr){
            num = (num * 10) + i;
        }

        // finding the sum of first and last digit of the num
        int sum = arr[0] + arr[arr.length -1];
        
        // printing the number
        System.out.println(num);

        // printing the sum of first and last digit
        System.out.println(sum);
    } 
}

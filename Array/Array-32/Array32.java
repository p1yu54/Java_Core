// Calculating the sum of digits of every element of an array and the maximum from them 

import java.util.Scanner;

public class Array32 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();
        
        int a[] = new int[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at the index " + (i+1) + " of your array :- ");
            a[i] = sc.nextInt();
        }

        return a;
    }

    public static void main(String[] args) {
        
        int a[] = inputArray();
        int total[] = new int[a.length];
        
        int max = 0;

        for(int i = 0 ; i < a.length; i++){
            int sum = 0;
            for(int temp = a[i] ; temp != 0 ; temp /= 10){
                int rem = temp % 10;
                sum += rem;
            }
            total [i] = sum;
        }
        max = total[0];
        for(int i = 0 ; i < total.length ; i++){
            if(total[i] > max){
                max = total[i];
            }
        }

        System.out.println("The max element is " + max);
    }
}

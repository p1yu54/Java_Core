// Finding the frequency of a particular element in an array

import java.util.*;

public class Array43 {
    public static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of your array :- ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns of your array :- ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " :- ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr ;
    }  
    
    public static void frequency(int a[][]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of element you want to find the frequency of :- ");
        int element = sc.nextInt();

        int count = 0;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(element == a[i][j]){
                    count++;
                }
            }
        }

        System.out.println("The frequency of " + element + " is " + count);
    }

    public static void main(String[] args) {
        int a[][] = inputArray();

        frequency(a);
    }
}

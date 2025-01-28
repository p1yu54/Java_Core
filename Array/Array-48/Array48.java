// Calculating for the average for all the elements in an 2d Array

import java.util.*;

public class Array48 {
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
        
        sc.close();

        return arr ;
    }

    public static void average(int a[][]){
        int sum = 0;
        int count = 0;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                sum += a[i][j]; 
                count++;
            }
        }

        int avg = sum / count;

        System.out.println("The average of all the elements = " + avg);
    }

    public static void main(String[] args) {
        int a[][] = inputArray();
        average(a);
    }
}

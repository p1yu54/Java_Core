// Finding the largest element in an 2D array with its respective index

import java.util.*;

public class Array50 {
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

    public static void largestElement(int a[][]){
        int max = 0;
        int rowIndex = 0;
        int colIndex = 0;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                    rowIndex = i+1;
                    colIndex = j+1;
                }
            }
        }

        System.out.println("The largest element in the array is  " + max);
        System.out.println("At row " + rowIndex);
        System.out.println("At column " + colIndex);
        System.out.println();

    }
    public static void main(String[] args) {
        int a[][] = inputArray();

        largestElement(a);
    }
}

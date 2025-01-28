// Finding the smallest element in an array

import java.util.*;

public class Array42 {

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

    public static void smallestElement(int a[][]){
        int min = a[0][0];
        
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(min > a[i][j]){
                    min = a[i][j];
                }
            }
        }

        System.out.println(min);

    }

    public static void main(String[] args) {
        int a[][] = inputArray();

        smallestElement(a);
    }
}

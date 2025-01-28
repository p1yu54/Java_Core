// Finding the maximum element in each row

import java.util.*;

public class Array44 {
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

    public static void maximum(int a[][]){
        int max[] = new int[a[0].length];

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(max[i] < a[i][j]){
                    max[i] = a[i][j];
                }
            }
        }

        for(int i = 0 ; i < max.length ; i++){
            System.out.println("The maximum element in row " + (i+1) + " is " + max[i]);
        }
    }

    public static void main(String[] args) {
        int a [][] = inputArray();

        maximum(a);
    }
}

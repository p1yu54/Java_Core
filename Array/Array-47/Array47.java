// Calculating the sum of all the outermost elements on and array

import java.util.*;

public class Array47{
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

    public static void sum(int a[][]){
        int sum = 0;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(i == 0 || i == a.length - 1 || j == 0 || j == a[0].length - 1){
                    sum+= a[i][j];
                }
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int a[][] = inputArray();
        sum(a);
    }
}
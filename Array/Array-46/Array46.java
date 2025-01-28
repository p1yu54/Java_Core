// Finding the minimum element in each column

import java.util.*;

public class Array46 {
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

    public static void minimum(int a[][]){
        int min[] = new int[a[0].length];

        for(int i = 0 ; i < a.length ; i++){
            min[i] = a[0][i];
            for(int j = 0 ; j < a[i].length ; j++){
                if(min[i] > a[j][i]){
                    min[i] = a[j][i];
                }
            }
        }

        for(int i = 0 ; i < min.length ; i++){
            System.out.println("The minimum element in row " + (i+1) + " is " + min[i]);
        }
    }

    public static void main(String[] args) {
        int a [][] = inputArray();

        minimum(a);
    }
}

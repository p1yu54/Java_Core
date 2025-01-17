// Finding the maximum element in an 2-D array 

import java.util.Scanner;

public class Array37 {
    public static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows of your array :- ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns of your array :- ");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " :- ");
                a[i][j] = sc.nextInt();
            }
        }

        return a;
    }

    public static void maxElement(int a[][]){
        int max = 0 ;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(max < a[i][j]){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args){
        int a[][] = inputArray();

        maxElement(a);
    }
}

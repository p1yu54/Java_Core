// Multiplication of two 2-D array

import java.util.*;

public class Array53 {
    static Scanner sc = new Scanner(System.in);

    public static int[][] inputArray(){

        System.out.print("Enter the number of rows :- ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns :- ");
        int cols = sc.nextInt();

        int a[][] = new int[rows][cols];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " :- ");
                a[i][j] = sc.nextInt();
            }
        }

        return a;
    }

    public static void Multiplication(int a1[][] , int r1 ,int c1 , int a2[][] , int r2 , int c2){     

        int multi[][] = new int[r1][c2];

        for(int i = 0 ; i < r1 ; i++){
            for(int j = 0 ; j < c2 ; j++){
                for(int k = 0 ; k < c2 ; k++){
                    multi[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        printn(multi);                
    }

    public static void printn(int a[][]){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("For first array :- ");
        int a1[][] = inputArray();

        System.out.println("For second array :- ");
        int a2[][] = inputArray();

        Multiplication(a1 , a1.length , a1[0].length , a2 , a2.length , a2[0].length);
    }
}

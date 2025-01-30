// Addition of two 2-D array

import java.util.*;

public class Array52 {
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

    public static void Addition(int a1[][] , int a2[][]){     

        if(a1.length == a2.length || a1[0].length == a2[0].length){
            int add[][] = new int[a1.length][a1[0].length];

            for(int i = 0 ; i < a1.length ; i++){
                for(int j = 0 ; j < a1[i].length ; j++){
                    add[i][j] = a1[i][j] + a2[i][j];
                }
            }

            printn(add);
        }
        else{
            System.out.println("The number of rows and columns are equal");
        }
        
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

        Addition(a1, a2);
    }
}

// Calculating the sum of all the elements in an 2-D array 

import java.util.Scanner;

public class Array36 {
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

    public static void printn(int a[][]){
        for(int i = 0 ; i< a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void sumOfElements(int a[][]){
        int sum = 0;

        for(int i = 0 ; i< a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                sum += a[i][j];
            }
        }

        System.out.println("The sum of all the elements of your array :- " + sum);
    }
    public static void main(String[] args) {
        int a[][] = inputArray() ;
        sumOfElements(a);
        
    }
}

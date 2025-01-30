// Checking if any particulalr element is present in the 2d array

import java.util.Scanner;

public class Array51 {
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

    public static void elementCheck(int a[][]){
        
        System.out.print("Enter the element you want to check :- ");
        int element = sc.nextInt();
        int rowIndex = 0 ;
        int colIndex = 0 ; 
        boolean flag = false;

        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                if(element == a[i][j]){
                    flag = true;
                    rowIndex = i+1;
                    colIndex = j+1;
                }
            }
        }

        if(flag){
            System.out.print("Element is found at row " + rowIndex + " and column " + colIndex);
        }
        else{
            System.out.println("Element is not found");
        }
    }

    public static void main(String[] args){
        int a[][] = inputArray();

        elementCheck(a);
    }
}

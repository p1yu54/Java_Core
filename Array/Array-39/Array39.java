// Calculating the sum of all the element in each column

import java.util.Scanner;

public class Array39 {
    public static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);

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

    public static void sumOfCols(int a[][]){
        int total[] = new int[a.length];
        
        for(int i = 0 ;  i < a.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < a[i].length ; j++){
                sum += a[j][i];
            }
            total[i] = sum;
        }

        System.out.println("The sums of all element of each columns are :- ");
        for(int i = 0 ; i < total.length ; i++){
            System.out.print(total[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[][] = inputArray();

        sumOfCols(a);
    }    
}

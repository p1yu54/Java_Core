// Finding the largest element of each column with the respective index

import java.util.*;

public class Array49 {
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

    public static void largestElement(int a[][]){
        int max[] = new int[a[0].length];
        int rowIndex[] = new int[a[0].length];
        int colIndex[] = new int[a[0].length];

        for(int i = 0 ; i < a.length ; i++){
            max[i] = a[0][i];
            
            for(int j = 0 ; j < a[i].length ; j++){
                if(max[i] < a[j][i]){
                    max[i] = a[j][i];
                    rowIndex[i] = i+1;
                    colIndex[i] = j+1;
                }
            }
        }

        for(int i = 0 ; i < max.length ; i++){
            System.out.println("The largest element in column " + (i+1) + " is " + max[i]);
            System.out.println("At row " + rowIndex[i]);
            System.out.println("At column " + colIndex[i]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int a[][] = inputArray();

        largestElement(a);
    }
}

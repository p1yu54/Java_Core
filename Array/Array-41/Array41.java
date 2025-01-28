// Calculating all the elements of each rows and finding the minimum of these sum

import java.util.Scanner;

public class Array41{
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
    public static void printn(int a[][]){
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[i].length ; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static void sumOfRow(int a[][]){
        int count = a[0].length;
        int sum[] = new int[count];
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ;  j < a[i].length ; j++){
                sum[i] += a[i][j];
            }
        }

        MaxRow(sum);
    }

    public static void MaxRow(int sum[]){
        int min = sum[0];

        for(int i = 0 ; i < sum.length ; i++){
            if(min > sum[i]){
                min = sum[i];
            }
        }
        System.out.println("The minimum of sum of elements of rows is :- " + min);
    }
    public static void main(String[] args) {
        
        int a[][] = inputArray();

        sumOfRow(a);
    }
}

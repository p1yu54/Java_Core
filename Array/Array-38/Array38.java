// Calculating the sum of all the element in each row

import java.util.Scanner;

public class Array38 {
    public static int[][] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numeber of rows :- ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of cols :- ");
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

    public static void sumOfROw(int a[][]){
        int total[] = new int[a.length];
        
        for(int i = 0 ;  i < a.length ; i++){
            int sum = 0;
            for(int j = 0 ; j < a[i].length ; j++){
                sum += a[i][j];
            }
            total[i] = sum;
        }

        System.out.println("The sums of all element of each row are :- ");
        for(int i = 0 ; i < total.length ; i++){
            System.out.print(total[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[][] = inputArray();
        sumOfROw(a);
    }
}

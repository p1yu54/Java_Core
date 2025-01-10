// finding the unique elements in an array as well as counting the total number of them

import java.util.Scanner;

public class Array34 {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        int a[] = new int[size];

        for(int i = 0 ; i < a.length ; i++){
            System.out.print("Enter the element at the index " + i + " in your array :- ");
            a[i] = sc.nextInt();
        }

        return a;
    }
    public static void main(String[] args) {
        
        int a[] = inputArray();
        int count = 0;

        System.out.println("The unique numbers in your array are :- ");
        for(int i = 0 ; i < a.length ; i++){
            boolean flag = true;
            for(int j = 0 ; j < a.length ; j++){
                if( i != j && a[i] == a[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(a[i]);
                count++;
            }
        }

        System.out.println("The total number of unique element in your array :- " + count);
    }
}

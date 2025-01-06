// WAP to check for vowels in an array as well as printing the index and total number of vowels

import java.util.Scanner;

public class Array17 {
    public static char[] inputArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of your array :- ");
        int size = sc.nextInt();

        char arr[] = new char[size];

        for(int i = 0 ; i < size ; i++){
            System.out.print("Enter the element at " + (i+1) + " of your array :- ");
            arr[i] = sc.next().charAt(0);
        }
        
        return arr;
    }

    // to check for the vowels in the array
    public static void isVowel(char arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'o' || arr[i] == 'u'){
                System.out.print(arr[i] + " ");
            }
            else if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
    }

    // to find the indices of the vowels in the array
    public static void vowelIndex(char arr[]){
        System.out.print("Vowels are at the indices :- ");
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                System.out.print((i+1) + " ");
            }
            else if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                System.out.print((i+1) + " ");
            }
        }
        System.out.println();
    }

    public static void vowelCount(char arr[]){
        System.out.print("The total number of vowels are :- ");
        int count = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u'){
                count++;
            }
            else if(arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U'){
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        char arr[] = inputArray();
        
        isVowel(arr);
        vowelIndex(arr);
        vowelCount(arr);
    }    
}

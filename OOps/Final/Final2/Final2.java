// Making a Final class a final method in the class and accessing the method in main method

import java.util.Scanner;

final class A{
    final void isPrime(int num){
        for(int i = 2 ; i < num ; i++){
            if(num % i != 0){
                System.out.println(num + " is a prime number");
                break;
            }
            else{
                System.out.println(num + " is not a prime number");
                break;
            }
        }
    }
}

public class Final2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        new A().isPrime(num);
    }
}

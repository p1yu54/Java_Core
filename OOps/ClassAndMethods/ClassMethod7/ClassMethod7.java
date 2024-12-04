// Making method for functions like EvenOdd , Factorial , Palindrome , Armsstrong , Neon (with passing arguments as well as returning their solution)

import java.util.Scanner;

class Methods{
    boolean EvenOdd(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    int Factorial(int num){
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }

    boolean Palindrome(int num){
        int rem = 0;
        for(int temp = num ; temp != 0 ; temp /= 10){
            rem = (rem * 10) + (temp %10);
        }
        if(num == rem){
            return true;
        }
        else{
            return false;
        }
    }

    boolean Armsstrong(int num){
        int rem = 0 , cube , sum = 0 , count = 0;

        for(int temp = num ; temp != 0 ; temp /= 10){
            count++;
        }
        for(int temp = num ; temp != 0 ; temp /= 10){
            rem = temp % 10;
            cube = 1;
            for(int i = 1 ; i <= count ; i++){
                cube *= rem ;
            }
            sum += cube;
        }
        if(num == sum){
            return true;
        }
        else{
            return false;
        }
    }

    boolean Neon(int num){
        int power = num * num;
        int rem = 0,res = 0;

        for(int temp = power ; temp != 0 ; temp /= 10){
            rem = temp % 10;
            res += rem;
        }
        if(num == res){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ClassMethod7 {
    public static void main(String[] args) {
        Methods m = new Methods();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();

        System.out.println("Is even " + m.EvenOdd(num));
        System.out.println("Is palindrorme " + m.Palindrome(num));
        System.out.println("Factorial = " + m.Factorial(num));
        System.out.println("Is Armstrong " + m.Armsstrong(num));
        System.out.println("Is Neon " + m.Neon(num));
    }

}

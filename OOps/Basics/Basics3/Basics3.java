// Making methods in another class for functions like EvenOdd,Factorial,Palindrome,Armstrong,Neon
import java.util.Scanner;

class Functions{
    void EvenOdd(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :- ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
    }

    void Factorial(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }

        System.out.println("The factorial of " + num + " = " + fact);
    }

    void Palindrome(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        int rem =0;

        for(int temp = num ; temp != 0 ; temp /= 10){
            rem = (rem * 10 ) + (temp % 10);
        }
        if(rem == num){
            System.out.println(num + " is a palindrome number");
        }
        else{
            System.out.println(num + " is not a palindrome number");
        }
    }

    void Armstrong(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();
        
        int count = 0 , temp , rem , cube , sum = 0;

        for(temp = num ; temp != 0 ; temp /= 10){
            count++;
        }

        for(temp = num; temp != 0 ; temp /= 10){
            rem = temp % 10;
            cube = 1;
            for(int i = 1 ; i <= count ; i++){
                cube *= rem;
            }

            sum += cube;
        }
        if(num == sum){
            System.out.println(num + " is an armstrong number");
        }
        else{
            System.out.println(num + " is not an armstorng number");
        }
    }

    void Neon(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :- ");
        int num = sc.nextInt();

        int power = num * num;
        int rem , sum = 0;

        for(int temp = power ; temp != 0 ; temp /= 10){
            rem = temp % 10;

            sum += rem;
        }

        if(num == sum){
            System.out.println(num + " is a neon number");
        }
        else{
            System.out.println(num + " is not a neon number");
        }
    }
}
public class Basics3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions functions = new Functions();
        
        System.out.print("Enter your function :- ");
        String input = sc.next();

        if(input.equalsIgnoreCase("EvenOdd")){
            functions.EvenOdd();
        }
        else if(input.equalsIgnoreCase("Factorial")){
            functions.Factorial();
        }
        else if(input.equalsIgnoreCase("Palindrome")){
            functions.Palindrome();
        }
        else if(input.equalsIgnoreCase("Armstrong")){
            functions.Armstrong();
        }
        else if(input.equalsIgnoreCase("Neon")){
            functions.Neon();
        }
        else{
            System.out.println("Invalid input");
        }
    }
}     

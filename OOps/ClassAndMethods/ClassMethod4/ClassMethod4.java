// Making methods in another class for functions like EvenOdd,Factorial,Palindrome,Armstrong,Neon and as well as returning their output
import java.util.Scanner;
class Functions{
    boolean EvenOdd(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :- ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    int Factorial(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :- ");

        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }
    boolean Palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :- ");
        int num = sc.nextInt();
        int rem =0;
        for(int temp = num ; temp != 0 ; temp /= 10){
            rem = (rem * 10 ) + (temp % 10);
        }
        if(rem == num){
            return true;
        }
        else{
            return false;
        }
    }
    boolean Armstrong(){
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
            return true;
        }
        else{
            return false;
        }
    }
    boolean Neon(){
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
            return true;
        }
        else{
            return false;
        }
    }
}
public class ClassMethod4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Functions functions = new Functions();
        
        System.out.print("Enter your function :- ");
        String input = sc.next();
        if(input.equalsIgnoreCase("EvenOdd")){
            System.out.println(functions.EvenOdd());
        }
        else if(input.equalsIgnoreCase("Factorial")){
            System.out.println(functions.Factorial());
        }
        else if(input.equalsIgnoreCase("Palindrome")){
            System.out.println(functions.Palindrome());
        }
        else if(input.equalsIgnoreCase("Armstrong")){
            System.out.println(functions.Armstrong());
        }
        else if(input.equalsIgnoreCase("Neon")){
            System.out.println(functions.Neon());
        }
        else{
            System.out.println("Invalid input");
        }
    }
}     
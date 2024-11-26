import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();

        for(int i = 2 ; i <= num ; ++i){
            if(num == 2){
                System.out.println(num + " is a Prime Number");
                break;
            }
            else{
                if(num % i != 0){
                    System.out.println(num + " is a Prime Number");
                    break;
                }
                else{
                    System.out.println(num + " is not a Prime Number");
                    break;
                }
            }
        }
    }    
}

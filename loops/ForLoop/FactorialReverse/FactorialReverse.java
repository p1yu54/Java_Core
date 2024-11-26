import java.util.Scanner;
public class FactorialReverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your function(Factorial / Reverse) :-");
        String input = sc.nextLine();

        if(input.equals("Factorial")){

            System.out.print("Enter your number :-");
            int num = sc.nextInt();

            int fact = 1;

            for(int i = 1 ; i <= num ; i++){
                fact = fact * i;
            }
            System.out.print(fact);
        }
        else if(input.equals("Reverse")){
            
            System.out.print("Enter your number :-");
            int num = sc.nextInt();

            int rev = 0;

            for(int temp = num ; temp != 0 ; temp /= 10){
                int rem = temp % 10;
                rev = (rev * 10) + rem;
            }
            System.out.println(rev);
        }
    }    
}

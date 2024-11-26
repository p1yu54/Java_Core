import java.util.Scanner;

public class DivisibleByRandomNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of number one :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of number two :-");
        int num2 = sc.nextInt();
        
        for(int i = 1 ; i <= 100 ; i++){
            if(i % num1 == 0 && i % num2 == 0){
                System.out.println(i);
            }
        }
    }   
}

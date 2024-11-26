import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();

        int count = 0;

        for(int temp = num ; temp != 0 ; temp /= 10){
            count++;
        }
        System.out.println(count);
    }    
}

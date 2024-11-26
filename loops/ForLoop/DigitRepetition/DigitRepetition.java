import java.util.Scanner;

public class DigitRepetition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();

        for(int i = 0 ; i <= 9 ; i++){
            int temp = num;
            int count = 0;
            while(temp != 0){
                int rem = temp % 10;
                temp /= 10;
                if(rem == i){
                    count++;
                }
            }
            System.out.println("The number of " + i + " is " + count);
        }
    }
}

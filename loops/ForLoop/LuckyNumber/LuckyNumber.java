import java.util.Scanner;

public class LuckyNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your four digit number :-");
        int num = sc.nextInt();

        int count = 0;

        for(int temp = num ; temp != 0 ; temp /= 10){
            count++;
        }

        if((count == 4) && (num > 0)){
            if((num % 3 == 0) || (num % 5 == 0) || (num % 7 == 0)){
                System.out.println(num + " is Lucky Number");
            }
            else{
                System.out.println("Sorry " + num + " its not your lucky Number");
            }
        }
        else{
            System.out.println("Ivalid Input");
        }
    }
}
import java.util.Scanner;

public class SumOfEvenNumbersInRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number :-");
        int start = sc.nextInt();

        System.out.print("Enter the ending point :-");
        int end = sc.nextInt();

        int sum = 0;

        for(int i = start ; i <= end ; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }    
}

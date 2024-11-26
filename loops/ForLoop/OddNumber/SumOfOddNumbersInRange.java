import java.util.*;
public class SumOfOddNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the starting value :-");
        int start = sc.nextInt();
    
        System.out.print("Enter the ending value :-");
        int end = sc.nextInt();
    
        int sum = 0;

        for(int i = start ; i <= end ; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}

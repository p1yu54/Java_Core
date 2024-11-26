import java.util.Scanner;

public class TableInRange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting value :-");
        int start = sc.nextInt();

        System.out.print("Enter the ending value :-");
        int end = sc.nextInt();

        for(int i = start ; i <= end ; i++){
            for(int j = 1 ; j <= 10 ; j++){
                System.out.println(i + "X" + j + "=" + i * j);
            }
        }
    }    
}

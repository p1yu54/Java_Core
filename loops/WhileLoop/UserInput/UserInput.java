import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of start: ");
        int start = sc.nextInt();

        System.out.print("Enter the value of end: ");
        int end = sc.nextInt();

        while (start <= end) {
            System.out.println(start);
            start++;
        }
    }
}

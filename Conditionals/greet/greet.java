import java.util.Scanner;
public class greet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your time :-");
        String time = sc.next();

        System.out.println("Good "+time);
    }
}

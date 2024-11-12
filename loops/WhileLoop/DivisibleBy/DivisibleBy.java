import java.util.Scanner;
public class DivisibleBy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 :-");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 :-");
        int num2 = sc.nextInt();

        int i = 1;
        while (i <= 100) {
            if (i % num1 == 0 || i % num2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}

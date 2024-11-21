import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();
        
        int sqNum = num * num;
        
        int rem ,add=0;

        while(sqNum > 0){
            rem = sqNum % 10;
            sqNum = sqNum / 10;
            add = rem + add;
        }
        System.out.println(add);
        if(add == num){
            System.out.println(num + " is a Neon Number");
        }
        else{
            System.out.println(num + " is not a  Neon Number");
        }
    }
}

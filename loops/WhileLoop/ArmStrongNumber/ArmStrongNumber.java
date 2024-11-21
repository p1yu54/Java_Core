import java.util.*;
public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();

        int rem = 0  , temp1 , temp , cube = 0 , count = 0;
        temp = num;
        temp1 = num;

        while(temp > 0){
            rem = temp % 10;
            temp /= 10;
            count++;
        }

        while(num > 0){
            int res = 1;
            rem = num % 10;
            num /= 10;
            for(int i = 1 ; i <= count ; i++){
                res *= rem;
            }
            cube += res;
        }

        if(cube == temp1){
            System.out.println(temp1 + "," + cube  + " is an armstrong number");
        }
        else{
            System.out.println(temp1 + "," + cube + " is not an armstorng number");
        }
    }
}

import java.util.*;
public class integerType {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println(num + " is a positve integer");
        }
        else if(num < 0){
            System.out.println(num + " is a negative integer");
        }
        else{
            System.out.println("Num is 0");
        }

    }
}


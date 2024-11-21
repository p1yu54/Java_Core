import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :-");
        int num = sc.nextInt();
        
        int i = 2; 
        boolean flag = true;
        
        while(i < num){
            if(num % i != 0){
                flag = true;
                break;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Compsoite number");
        }
    }    
}

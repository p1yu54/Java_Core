import java.util.*;
public class table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the number :-");
        int num = sc.nextInt(); 
        
        int i = 1;

        while(i <= 10){
            System.out.println(num + " * " + i + " = " + num * i);
            i++;
        }
    }    
}

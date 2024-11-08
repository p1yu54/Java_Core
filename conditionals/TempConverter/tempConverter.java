import java.util.*;

public class tempConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input(C/F) :- ");
        char input = sc.next().charAt(0);

        if(input == 'C'){
            System.out.print("Enter the temprature in Celcius :- ");
            int temp = sc.nextInt();

            int F = ((temp * 9) / 5) + 32;
            System.out.println(temp + " Celcius is " + F + " Farenheit");
        }    
        else if (input == 'F') {
            System.out.print("Enter your temprature in Farenheit :- ");
            int temp = sc.nextInt();

            int C = ((temp - 32) * 5) / 9;
            System.out.println(temp + " Farenheit is " + C + " Celcius"); 
        }
    }
}

import java.util.Scanner;

public class TaxCal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Salary :-");
        int income = sc.nextInt();

        if(income < 10000)
            System.out.println(income);
        
        else if(income > 10000 && income <= 30000)
            System.out.println(income - (income / .1));

        else if(income > 30000 && income <= 50000)
            System.out.println(income - (income / .2));

        else
            System.out.println(income - (income  * .3));
    }
}

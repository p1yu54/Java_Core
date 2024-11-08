import java.util.*;

public class bmiCal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your weight in KGs :-");
        double weight = sc.nextDouble();

        System.out.print("Enter your heigth in meters :-");
        double height = sc.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("Your BMI is = " + BMI);
        
        if(BMI < 18.5){
            System.out.print("You are under weigth");
        }
        else if(BMI >= 18.5 && BMI < 25){
            System.out.println("You are at normal weight");
        }

        else if(BMI >=25 && BMI < 30){
            System.out.println("You are Overweight");
        }
        else if(BMI >= 30){
            System.out.println("You are Obese");
        }
    }
}
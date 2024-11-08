import java.util.*;
public class menu {
    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice :-");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Butter chicken  :- 250rs");
        }
        else if(choice == 2){
            System.out.println("Chicken 65  :- 200rs");
        }
        else if(choice == 3){
            System.out.println("Chicken tikka  :- 200rs");
        }
        else{
            System.out.println("Input not found");
        }
    }
}

import java.util.*;
public class VowelConsonent {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter your character :- ");
            char input = sc.next().charAt(0);

            if((input == 'a') || (input == 'e') || (input == 'i') || (input == 'o') || (input == 'u')){
                System.out.println(input + " is a vowel");
            }
            else if((input == 'A') || (input == 'E') || (input == 'I') || (input == 'O') || (input == 'U')){
                System.out.println(input + " is a vowel");
            }
            else{
                System.out.println(input + " is a consonent");
            }
            
        }
}

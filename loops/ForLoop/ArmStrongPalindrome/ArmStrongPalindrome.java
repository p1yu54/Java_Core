import java.util.Scanner;
public class ArmStrongPalindrome{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your function(Armstrong / Palindrome) :-");
        String input = sc.nextLine();

        int temp , rem = 0;


        /* 
            This block of if will check if the input is Armstrong and if executed will take an number as input and will
            then check if the number is Armstrong or not
        */
        if(input.equals("Armstrong")){
            
            System.out.print("Enter your number :-");
            int num = sc.nextInt();
            
            int count = 0, cube = 1,res=0;

            for(temp = num ; temp != 0 ; temp /= 10){
                count++;
            }

            for(temp = num ; temp != 0 ; temp /= 10){
                rem = temp % 10;
                cube = 1;
                for(int i = 1 ; i <= count ; i++){
                    cube *= rem;
                }
                res += cube;
            }

            if(num == res){
                System.out.println(num + " is an Armstrong number");
            }
            else{
                System.out.println(num + " is not an Armstrong number");
            }
        }

        else if(input.equals("Palindrome")){

            System.out.print("Enter your number :-");
            int num = sc.nextInt(); 

            int rev =0;

            for(temp = num ; temp != 0 ; temp /= 10){
                rem = temp % 10;
                rev = (rev * 10 )+ rem;   
            }

            if(rev == num){
                System.out.println(num + " is a Palindrome number");
            }
            else{
                System.out.println(num + " is not a Palindrome number");
            }
        }
        else{
            System.out.println("Input not valid");
        }

    }
}


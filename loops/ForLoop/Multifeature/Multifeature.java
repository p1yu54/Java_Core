import java.util.Scanner;

public class Multifeature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your function");
        System.out.println("1 Neon Number:-");
        System.out.println("2. Perfect Number :-");
        System.out.println("3. Prime Number or List of Prime Number :-");
        System.out.println("4. Count of digits or Sum of digits :-");
        System.out.println("5. Fibonacci Series :-");

        int functionNumber = sc.nextInt();

        //code block of Neon Number
        if(functionNumber == 1){

            //taking the input of the number
            System.out.print("Enter your number ;-");
            int num = sc.nextInt();

            //calculating the square of the number
            int sqare = num * num;
            int res = 0;

            for(int temp = sqare ; temp != 0; temp /= 10){
                int rem = temp % 10;
                res += rem;
            }

            //checking for the mandatory conditions for neon number
            if(num == res){
                System.out.println(num + " is a Neon Number");
            }
            else{
                System.out.println(num +" is not a Neon Number");
            }
        }

        //code block for perfect number
        else if(functionNumber == 2){

            //taking the input for the number
            System.out.print("Enter your number :-");
            int num = sc.nextInt();

            int sum = 0;

            for(int i = 1 ; i < num ; i++){
                if(num % i == 0){
                    sum += i;
                }
            }   
            if(num == sum){
                System.out.println(num + " is a Perfect Number ");
            }
            else{
                System.out.println(num + " is not a Perfect Number");
            }

        }


        //code block for prime number or list of prime numbers
        else if(functionNumber == 3){

            //taking input for check prime number or to print prime number (1 to 100)
            System.out.print("Enter your function(PrimeNumber / PrimeNumberTilln :-");
            String function = sc.next();

            if(function.equals("PrimeNumber")){
                //taking the input of the number
                System.out.print("Enter your number :-");
                int num = sc.nextInt();

                boolean flag = true;

                for(int i = 2 ; i < num ; i++){
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
                    System.out.println(num + " is a Prime Number");
                }
                else{
                    System.out.println(num + " is not a  Prime Number");
                }
            }

            else if(function.equals("PrimeNumberTilln")){

                //taking input the staring point of the range
                System.out.print("Enter your starting number :-");
                int start = sc.nextInt();

                // taking input the ending point of the range
                System.out.print("Enter your ending point :-");
                int end = sc.nextInt();

                System.out.println(2);

                for(int i = start ; i <= end ; i++){
                    for(int j = 2 ;j < i ; j++){
                        if(i % j == 0){
                            System.out.println("");
                            break;
                        }
                        else{
                            System.out.print(i);
                            break;
                        }
                    }
                }
            }

            else{
                System.out.println("invalid input");
            }
        }

        //code block for count or sum of digits
        else if(functionNumber == 4){

            System.out.println("Enter your function (Count / Sum)");
            String function = sc.next();
            
            //code block for count of digit part
            if(function.equals("Count")){
                
                //taking input of the number
                System.out.print("Enter your number :-");
                int num = sc.nextInt();

                //making "count" variable to store the count of digits of the number
                int count = 0 ;

                for(int temp = num ; temp != 0 ; temp /= 10){
                    count++;
                }
                System.out.println("The number of digits in " + num + " = " + count);
            }

            //code block for the sum of digits of the number
            else if(function.equals("Sum")){
                
                //taking input for the number
                System.out.print("Enter your number :-");
                int num = sc.nextInt();

                //making "sum" variable to store the sum of digits of the number
                int sum = 0;

                for(int temp = num ; temp != 0 ; temp /= 10){
                    int rem = temp % 10;
                    sum += rem;    
                }
                System.out.println("The sum of digits of " + num + " = " +sum);
            }
        }

        //code block of Fibonacci series
        else if(functionNumber == 5){

            //taking the limit as input
            System.out.print("Enter the limit of your series :-");
            int range = sc.nextInt();

            int first_term = 0 ;
            int second_term = 1 ;
            int third_term = first_term + second_term;
    
            System.out.println(first_term);
            System.out.println(second_term);
            for(int i = 1 ; i <= (range - 3) ; i++){
                System.out.println(third_term);
                first_term = second_term;
                second_term = third_term;
                third_term = first_term + second_term;
            }
        }
        else{
            System.out.println("Input is invalid");
        }    
    }
}

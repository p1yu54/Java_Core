// Making methods for EvenOdd , Factorial , Palindrome , Armstrong , Neon number in another class and as well as they return their solutions

class Methods{
    boolean EvenOdd(){
        int num = 23;
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    int Factorial(){
        int num = 6;
        int fact =1;
        for(int i = 1 ; i <= num ; i++){
            fact *= i;
        }
        return fact;
    }

    boolean Palindrome(){
        int num = 121;
        int rem = 0;
        for(int temp = num ; temp != 0 ; temp /= 10){
            rem = (rem * 10 )+(temp % 10 );
        }
        if(num == rem){
            return true;
        }
        else{
            return false;
        }
    }

    boolean Armstrong(){

        int num = 153;
        
        int count = 0 , temp , rem , cube , sum = 0;
        for(temp = num ; temp != 0 ; temp /= 10){
            count++;
        }
        for(temp = num; temp != 0 ; temp /= 10){
            rem = temp % 10;
            cube = 1;
            for(int i = 1 ; i <= count ; i++){
                cube *= rem;
            }
            sum += cube;
        }
        if(num == sum){
            return true;
        }
        else{
            return false;
        }
    }
    boolean Neon(){
        int num = 9;
        int power = num * num;
        int rem , sum = 0;
        for(int temp = power ; temp != 0 ; temp /= 10){
            rem = temp % 10;
            sum += rem;
        }
        if(num == sum){
            return true;
        }
        else{
            return false;
        }
    }
}
public class ClassMethod3 {
    public static void main(String[] args) {
        Methods methods = new Methods();
        
        System.out.println(methods.EvenOdd());
        System.out.println(methods.Factorial());
        System.out.println(methods.Palindrome());
        System.out.println(methods.Armstrong());
        System.out.println(methods.Neon());
    }
}

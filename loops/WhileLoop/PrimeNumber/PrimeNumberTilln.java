import java.util.Scanner;
public class PrimeNumberTilln {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number :-");
        int num = sc.nextInt();

        int index = 2;
        System.out.println(2);
        while(index <= num){
            int i = 2;
            while(i < index){
                if(index % i != 0){
                    System.out.println(index);
                    break;
                }
                else{
                    break;
                }
            }
            i++;
            index++;
        }
    }
}

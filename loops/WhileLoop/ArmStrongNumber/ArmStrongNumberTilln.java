import java.util.Scanner;

public class ArmStrongNumberTilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of starting point :-");
        int start = sc.nextInt();

        System.out.print("Enter the value of ending point :-");
        int end = sc.nextInt();


        while(start <= end){
            int tempCount,tempCheck;
            tempCount = tempCheck = start;
            int count = 0;
            while(tempCount != 0){
                tempCount /= 10;
                count++;
            }
            int cube = 0;
            while(tempCheck != 0){
                int res = 1;
                int rem = tempCheck % 10;
                tempCheck /= 10;
                for(int i = 1 ; i <= count ; i++){
                    res *= rem;
                }
                cube += res;
            }
            if(start == cube){
                System.out.println(start);
            }
            start++;
        }
    }    
}

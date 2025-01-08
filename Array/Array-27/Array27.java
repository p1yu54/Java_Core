// Converting an array to a single number

public class Array27 {
    public static void printn(int a[]){
        for(int i = 0 ;  i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static long reverse(long num){
        long rem = 0;
        for(long temp = num ; temp != 0 ; temp /= 10){
            rem = (rem * 10) + (temp % 10);
        }
        return rem;
    }
    public static void arrayToNum(int a[]){
        long num = 0;
        int rem = 0;
        long num1 = 0; 
        for(int i = a.length -1 ; i >= 0 ; i--){
            for(int temp = a[i] ; temp != 0 ; temp /= 10){
                rem = temp % 10;
                num = (num * 10 ) + rem;
                num1 = reverse(num);
            }
        }
        System.out.println(num1);
    }
    public static void main(String[] args) {
        int a[] = {34,12,67,445,32};

        arrayToNum(a);
    }
}

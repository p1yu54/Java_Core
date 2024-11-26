public class FibonacciSeries {
    public static void main(String[] args) {
        
        int first_term = 0 ;
        int second_term = 1 ;
        int third_term = first_term + second_term;

        System.out.println(first_term);
        System.out.println(second_term);
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(third_term);
            first_term = second_term;
            second_term = third_term;
            third_term = first_term + second_term;
        }
    }    
}

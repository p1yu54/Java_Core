public class OneToHundredEven {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        while (i <= 100) {
            if(i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }    
}

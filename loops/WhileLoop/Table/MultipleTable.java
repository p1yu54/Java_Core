public class MultipleTable {
    public static void main(String[] args) {
        int num = 2;
        
        while(num <= 10){
            int i = 1;
            while(i <= 10){
                int multiple = num * i;
                System.out.println(num + " * " + i + " = " + multiple);
                i++;
            }
            num++;
        }
    }   
}

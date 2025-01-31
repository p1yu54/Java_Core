// Applying Get-Message method of exception

public class Exception6 {
    public static void main(String[] args) {
        try{
            int a = 9 / 0;
            System.out.println(a);
        }catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}

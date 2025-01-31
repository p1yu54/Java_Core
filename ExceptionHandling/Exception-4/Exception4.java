// Applying and the Print-Stack-trace method of exception

public class Exception4 {
    public static void main(String[] args) {
        try{
            int a = 9 / 0;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            ex.printStackTrace();
        }
    }
}

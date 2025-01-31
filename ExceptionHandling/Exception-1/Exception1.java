
// Handling exception with the help of try and catch

public class Exception1{
    public static void main(String[] args) {
        try{
            int a = 9 / 0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
        
    }
}

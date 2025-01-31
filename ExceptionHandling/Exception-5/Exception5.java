// Applying To-String method of exception

public class Exception5 {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.println(name.length());
        }catch(NullPointerException ex){
            System.out.println(ex.toString());
        }
    }    
}

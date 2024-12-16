// Declaring non abstract methods in an interface

interface A{
    default void show(int a){
        boolean flag = true;
        for(int i = 2 ; i < a ; i++){
            if(a % i != 0){
                flag = true;
                break;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(a + " is a prime number");
        }
        else{
            System.out.println(a + " is not a prime number");
        }
    }
}
class B implements A{
    
}
public class Interface5 {
    public static void main(String[] args) {
        B b = new B();
        b.show(13);
    }
}

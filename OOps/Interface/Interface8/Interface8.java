// Accessing an interface's method by reference variable

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
class B implements A{}

public class Interface8 {
    public static void main(String[] args) {
        A p = new B();
        p.show(13);
    }
}

// Applying access modifiers in interface

interface A{
    private void IntegerShow(){
        int privateVariable = 23;
        System.out.println("The value of private variable is " + privateVariable);
    }
    default void PrivateCall(){
        IntegerShow();
    }
}
interface B{
    default void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }
        else{
            System.out.println(num + " is odd number");
        }
    }
}
interface C{
    //protected void show(); 
    // we can not create a protected method in interface
    void show();
}
interface D{
    public void show1();
}
class E implements A,B,C,D{
    public void show(){
        System.out.println("This is protected method");
    }
    public void show1(){
        System.out.println("This is public method");
    }
}

public class Interface9 {
    public static void main(String[] args) {
        E p = new E();
        p.PrivateCall();
        p.EvenOdd(2323);
        p.show();
        p.show1();
    }
}

// Problem : Overloading methods in abstract class
// Solution : Overloading methods in abstract class with different types of parameters

abstract class A{
    abstract void show();
    void show(int a){
        System.out.println("The value of a = " + a);
    }
}
class B extends A{
    public void show(){
        System.out.println("This is show method");
    }

}
public class Abstraction7 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show(89);
    }
}

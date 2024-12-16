// Making and accessing instance varibale in an abstract class in java 

abstract class A{
    int a = 12;
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("The value of a is " + a);
    }
}

public class Abstraction16 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

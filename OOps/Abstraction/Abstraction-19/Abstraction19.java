// Making and accessing public instance variable in an abstract class in java

abstract class A{
    public int a = 12;
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("The square of " + a + " is " + (a*a));
    }
}

public class Abstraction19 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

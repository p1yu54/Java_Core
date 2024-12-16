// Problem : can we make abstract method public in java : yes

abstract class A{
    abstract public void show();
}
class B extends A {
    public void show(){
        System.out.println("Hello World");
    }
}

public class Abstraction15 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

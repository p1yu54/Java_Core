// Problem : can we make abstract class protected in java :

protected abstract class A{
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("Hello World");
    }
}

public class Abstraction14 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

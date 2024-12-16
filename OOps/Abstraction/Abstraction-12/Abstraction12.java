// Problem : Can we make abstract class private in java

private abstract class A{
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("HelloWorld");
    }
}

public class Abstraction12 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

// Making and accessing protected instance variable in an abstract class in java

abstract class A{
    protected int a = 12;
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("Protected instance variable = " + a);
    }
}

public class Abstraction18 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }
}

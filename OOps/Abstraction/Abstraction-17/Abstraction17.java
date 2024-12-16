// Making and accessing private instance variable in an abstract class in java

abstract class A{
    private int a = 13; // it can only be accessed in this class only
    abstract void show();

    void show1(){
        System.out.println("The value of a = " + a);
    }
}
class B extends A{
    void show(){
        //System.out.println(a + "*" + 10 + " = " + (a*10)); // This will throw error
        // we can not access the instace variable of abstract class A here
    }
}

public class Abstraction17 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
        p.show1();
    }
}

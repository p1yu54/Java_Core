// Achieveing Multi-Level Inheritance with abstract class as parent class

abstract class A{
    abstract void show();
}

class B extends A{
    public void show(){
        System.out.println("This is abstract method of class A in class B");
    }
}

class C extends B{
    void show1(){
        System.out.println("This is show1 method of class C");
    }
}
public class Abstraction3 {
    public static void main(String[] args) {
        new C().show();
        new C().show1();
    }
}

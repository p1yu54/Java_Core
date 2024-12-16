// Achieveing Hierarchical Inheritance with abstract class as parent class

abstract class A{
    abstract void show();
}

class B extends A{
    public void show(){
        System.out.println("This is abstract method of A class in B class");
    }
}

class C extends A{
    public void show(){
        System.out.println("This is abstract method of A class in C class");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
        new B().show();
        new C().show();
    }
}

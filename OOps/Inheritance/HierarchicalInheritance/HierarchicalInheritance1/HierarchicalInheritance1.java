// Achieveing Hierarchical Inhertance by creating and extending constructors and accessing them in the main class

class A{
    A(){
        System.out.println("This is A class constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is B class constructor");
    }
}    
class C extends A{
    C(){
        System.out.println("This is C class constructor");
    }
}
class D extends A{
    D(){
        System.out.println("This is D class constructor");
    }
}
class E extends A{
    E(){
        System.out.println("This is E class constructor");
    }
}
public class HierarchicalInheritance1 {
    public static void main(String[] args) {
        new B();
        new C();
        new D();
        new E();
    }
}

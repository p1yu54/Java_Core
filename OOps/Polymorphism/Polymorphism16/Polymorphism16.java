// Achieveing Hierarchical Inheritance as well as method over riding

class A{
    void show(){
        System.out.println("This is A class method");
    }
}

class B extends A{
    void show(){
        super.show();
        System.out.println("This is B class method");
    }
}

class C extends A{
    void show(){
        super.show();
        System.out.println("This is C class method");
    }
}
public class Polymorphism16{
    public static void main(String[] args) {
        new B().show();
        new C().show();
    }
}
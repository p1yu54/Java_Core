// Achieveing Multi-Level Inheritance as well as method over riding

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

class C extends B{
    void show(){
        super.show();
        System.out.println("This is C class method");
    }
}
public class Polymorphism15 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
    }
}

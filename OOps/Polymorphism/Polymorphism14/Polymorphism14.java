// Achieving Single level Inheritance as well as method over riding

class A{
    void show(){
        System.out.println("This is A class Method");
    }
}

class B extends A{
    void show(){
        super.show();
        System.out.println("This is B class methods");
    }
}

public class Polymorphism14 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}

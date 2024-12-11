// Overloading constructor in the parent class and overloading method in child class

class A{
    A(){
        System.out.println("This is constructor of A class");
    }
    A(int A){ // This will throw error
        System.out.println("The value of A = " + A);
    }
}
class B extends A{
    void show(){
        System.out.println("This is method of B class");
    }

    void show(int B){ // This will throw error
        System.out.println("The value of B = " + B);
    }
}
public class Polymorphism12 {
    public static void main(String[] args) {
        new A();
        new A(23);
        B b = new B();
        b.show();
        b.show(23);
    }
}

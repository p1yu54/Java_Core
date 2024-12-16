// Multi-Level Inheritance  with paramerterised constructor and accessing through super keyword

class A{
    A(int a){
        System.out.println("The value of a = " + a);
    }
}
class B extends A{
    B(int b){
        super(++b);
        System.out.println("The value of b = " + b);
    }
}

class C extends B{
    C(int c){
        super(++c);
        System.out.println("The value of c " + c);
    }
}
public class Polymorphism20 {
    public static void main(String[] args) {
        new C(123);
    }
}

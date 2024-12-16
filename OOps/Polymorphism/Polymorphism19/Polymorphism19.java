// Single level inheritance with parameterised constructors and then accessing them through super keyword

class A{
    A(String a){
        System.out.println("A = B = " + a);
    }
}
class B extends A{
    B(String b){
        super(b);
        System.out.println("B = " + b);
    }
}
public class Polymorphism19 {
    public static void main(String[] args) {
        new B("Hello");
    }
}

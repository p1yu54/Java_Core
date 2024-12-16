// Hierarchical Inheritance  with paramerterised constructor and accessing through super keyword

class A{
    A(int a){
        if(a % 2 == 0){
            System.out.println(a + " is an even number");
        }

        else {
            System.out.println(a + " is an odd number ");
        }
    }
}

class B extends A{
    B(int b){
        super(++b);
        System.out.println("The value of b = " + b);
    }
}

class C extends A{
    C(int c){
        super(--c);
        System.out.println("The value of c = " + c);
    }
}
public class Polymorphism21 {
    public static void main(String[] args) {
        new B(234);
        new C(123123);
    }
}

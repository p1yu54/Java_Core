// Problem : Overloading Constructors

class A{
    A(){
        System.out.println("This is constructor of the A class");
    }
    A(){// This will throw error
        int A = 12;
        System.out.println("The value of A = " + A);
    }
}
public class Polymorphism9 {
    public static void main(String[] args) {
        new A();
        new A();
    }
}

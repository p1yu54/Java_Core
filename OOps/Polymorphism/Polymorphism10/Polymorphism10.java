// Solution 1 : Overloading constructors in a class by changing parameters in the constructors

class A{
    A(){
        System.out.println("This is A class constructor");
    }
    A(int a){
        System.out.println("And the value of a = " + a);
    }
}
public class Polymorphism10 {
    public static void main(String[] args) {
        new A();
        new A(23);
    }
}

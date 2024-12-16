// Making parameterised constructor on side of abstract method and non abstract method in abstract class and accessing through reference varible

abstract class A{
    A(int a){
        System.out.println("The value of a in the constructor of A = " + a);
    }
    
    abstract void sum(int num1 , int num2);

    void sub(int num1 , int num2){
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
    }
}

class B extends A{
    B(int b){
        super(b);
        System.out.println("The value of b in constructor of B = " + b);
    }

    public void sum(int num1 , int num2){
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    void square(int num){
        System.out.println("The square of " + num + " = " + (num * num));
    }
}
public class Abstraction6 {
    public static void main(String[] args) {
        //Making a reference variable of class A to call methods defined in class A as well as call the constructors of class A and B
        A a = new B(123);
        a.sub(1233, 323);
        a.sum(12, 324);

        //Making object of class B to class the methods defined in class B as well as call the constructor of class A and B
        B b = new B(123432);
        b.square(123);
    }
}

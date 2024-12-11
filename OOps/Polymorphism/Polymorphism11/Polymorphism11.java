// Solution 2 : Overloading constructors by changing the data type of the parameter

class A{
    A(String name){
        System.out.println("My name is " + name);
    }
    A(int age){
        System.out.println("My age is " + age);
    }
}
public class Polymorphism11 {
    public static void main(String[] args) {
        new A("Piyush");
        new A(18);
    }
}

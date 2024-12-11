// Overloading method with same name but having different data types of parameters

class A{
    void show(String name){
        System.out.println("My name = " + name);
    }
    void show(int age){
        System.out.println("My age = " + age);
    }
}

public class Polymorphism5{
    public static void main(String[] args) {
        A a = new A();
        a.show("Piyush");
        a.show(18);
    }
}
// Making defuault constructor on side of abstract method and non abstract method in abstract class and accessing through reference varible

abstract class A{
    A(){
        System.out.println("This is the constructor of abstract class A");
    }
    abstract void show(int age);

    void show1(String name){
        System.out.println("My name is " + name);
    }
}

class B extends A{
    B(){
        System.out.println("This is the constructor of B class");
    }
    public void show(int age){
        System.out.println("My age is " + age);
    }
}
public class Abstraction5 {
    public static void main(String[] args) {
        // accessing the constructors of class A and class B
        A a = new B();
        //reference varibable can only access the methods defined in class A
        a.show1("Piyush");

        //for accessing the methods defined in class B
        B b = new B();
        b.show(18);
    }
}

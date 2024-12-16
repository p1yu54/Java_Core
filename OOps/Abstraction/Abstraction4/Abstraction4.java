// Making abstract and non abstract methods in abstract class and accessing through reference variable

abstract class A{
    abstract int show(int a);
    A show1(){
        System.out.println("This is non abstract method of class A");
        return this;
    }
}

class B extends A{
    public int show(int a){
        System.out.println("The value of a = " + a);
        return a;
    }

    void show(){
        System.out.println("This is show method of class B");
    }
}
public class Abstraction4 {
    public static void main(String[] args) {
        
        //if accessing through reference varibale then only the methods defined in the class of whose reference variable is created can be called only
        // accessing the methods defined in class A by making a reference variable of A class
        A a = new B();
        a.show(123);

        //you can call all the methods defined in the parent as well as the child class by object of the child class
        //for calling the methods defined in class B by creating object of B class
        B b = new B();
        b.show();
        b.show1();
        b.show(1233);
    }
}

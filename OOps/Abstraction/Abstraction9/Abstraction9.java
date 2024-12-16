// Achieveing Multi-level Inheritance with abstract class

abstract class A{
    abstract void show1();
}

abstract class B extends A{
    abstract void show2();
}

abstract class C extends B{
    abstract void show3();
}

abstract class D extends C{
    abstract void show4();
}

class E extends D{
    public void show1(){
        System.out.println("This is abstract method of abstract class A");
    }

    public void show2(){
        System.out.println("This is abstract method of abstract class B");
    }

    public void show3(){
        System.out.println("This is abstract method of abstract class C");
    }

    public void show4(){
        System.out.println("This is abstract method of abstract class D");
    }
}
public class Abstraction9 {
    public static void main(String[] args) {
        E e = new E();
        e.show1();
        e.show2();
        e.show3();
        e.show4();
    }
}

// Achieveing multiple Single level inheritance by making multiple abstract classes

abstract class A{
    abstract void show1();
}

abstract class B{
    abstract void show2();
}

abstract class C{
    abstract void show3();
}

abstract class D{
    abstract void show4();
}

class E extends D{
    public void show4(){
        System.out.println("This is show4 mehtod of abstract class D");
    }
}

class F extends B{
    public void show2(){
        System.out.println("This is show2 method of abstract class B");
    }
}

class G extends C{
    public void show3(){
        System.out.println("This is show3 method of abstract class C");
    }
}

class H extends A{
    public void show1(){
        System.out.println("This is show1 method of abstract class A");
    }
}

public class Abstraction8 {
    public static void main(String[] args) {
        new E().show4();
        new F().show2();
        new G().show3();
        new H().show1();

    }
}

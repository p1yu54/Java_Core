// Making an interface inside a class and accessing it through another class

class A{
    void show1(){
        System.out.println("This is class method");
    }
    interface B{
        void show();
    }
}
class C extends A implements A.B{
    public void show(){
        System.out.println("This is the method of the interface");
    }
}

public class Interface14 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.show1();
    }
}

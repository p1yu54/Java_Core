// Making an interface inside a class and accessing it through another class

class A{
    void show1(){
        System.out.println("This is class mehtod");
    }
    
    interface B{
        void show2();
    }
}
class C extends A implements A.B{
    public void show2(){
        System.out.println("This is interface method");
    }
}

public class Interface15 {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        p.show2();
    }
}

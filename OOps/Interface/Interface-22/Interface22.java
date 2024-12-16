// Making and access method of an interface inside a class also consisting its default constructor

class A{
    A(){
        System.out.println("This is A class constructor");
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

public class Interface22 {
    public static void main(String[] args) {
        A.B p = new C();
        p.show();
    }
}

// Overriding methods in single level inheritance with same parameters

class A{
    void show(String name){
        System.out.println("My name is " + name);
    }
}
class B extends A{
    void show(String id){
        String name = "Piyush";
        super.show(name);
        System.out.println("My id is " + id);
    }
}
public class Polymorphism18 {
    public static void main(String[] args) {
        B b = new B();
        b.show("123p");
    }
}

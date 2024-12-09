// Making a class extending to another class and then extending to a another class and accessing in main class

class A{
    void show1(){
        System.out.println("This is A class method");
    }
}
class B extends A{
    void show2(){
        System.out.println("This is B class method");
    }
}
class C extends B{
    void show3(){
        System.out.println("This is C class method");
    }
}
public class MultiLevelInheritance1 {
    public static void main(String[] args) {
        C c = new C();
        c.show1();
        c.show2();
        c.show3();
    }
}

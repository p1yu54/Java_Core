class A{
    private void show(){
        System.out.println("This is private method in parent class");
    }
}
class B extends A{
    private void show1(){
        System.out.println("This is private method in child class");
    }
}
public class SingleLevelInheritance5 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show1();
    }
}

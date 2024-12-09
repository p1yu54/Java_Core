// Making a public method in parent class and private method in the child class and accessing it in the main class

class A{
    public void show(){
        System.out.println("This is public method of class A(Parent class)");
    } 
}
class B extends A {
    private void show1(){
        System.out.println("This is private method of class B(child class)");
    }
}
public class SingleLevelInheritance6 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show1();
    }
}

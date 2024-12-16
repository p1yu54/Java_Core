// Problem : Can we make abstract method private in java
abstract class A{
    abstract private void show();
}
class B extends A{
    private void show(){
        System.out.println("HelloWorld");
    }
}
public class Abstraction11 {
    public static void main(String[] args) {
        B p = new B();
        p.show(); // This will throw an error because it is private method so it only can be accessed in class B
    }    
}

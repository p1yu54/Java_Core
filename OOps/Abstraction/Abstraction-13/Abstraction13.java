// Problem : Can we make protected abstract method in java : yes
abstract class A{
    abstract protected void show();
}
class B extends A{
     protected void show(){
        System.out.println("Hello World");
    }
}
public class Abstraction13 {
    public static void main(String[] args) {
        B p = new B();
        p.show();
    }    
}

//  Making and accessing a constructor of a class inside an interface

interface A{
    class B{
        B(){
            System.out.println("This is the constructor of class B");
        }
    }
}
class C extends A.B{
    C(){
        System.out.println("This is the constructor of class C");
    }
}

public class Interface12 {
    public static void main(String[] args) {
        new C();
    }
}

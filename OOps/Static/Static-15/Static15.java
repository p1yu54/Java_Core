// Multiple nesting of classes

class A{
    class B {
        class C{
            void show(){
                System.out.println("This is method of class C inside class B inside class A");
            }
        }
    }
}
public class Static15 {
    public static void main(String[] args) {
        A.B.C c = new A().new B().new C();
        c.show();
    }
}

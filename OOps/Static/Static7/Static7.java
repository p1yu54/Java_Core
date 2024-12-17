// Nesting classes making inner class static and making a non-static method inside it

class A{
    static class B{
        void show(){
            System.out.println("This is non static method inside a static class ");
        }
    }
}
public class Static7 {
    public static void main(String[] args) {
        A.B a = new A.B();
        a.show();
    }
}

// Nesting classes making inner class static and making a non-static instance variable ande a static method inside it

class A{
    static class B{
        int a = 12;
        static void show(){
            System.out.println("The value of a = " + a);
        }
    }
}
public class Static8 {
    public static void main(String[] args) {
        A.B a = new A.B();
        a.show();
    }
}

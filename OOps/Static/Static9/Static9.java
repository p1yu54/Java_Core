// Nesting classes making inner class static and making a static instance variable ande a static method inside it

class A{
    static class B{
        static int a = 12;
        static void show(){
            System.out.println("The square of " + a + " = " + (a*a));
        }
    }
}

public class Static9 {
    public static void main(String[] args) {
        A.B.show();
    }
}

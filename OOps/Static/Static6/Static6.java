// Nesting classes making inner class static and making a static method inside it

class A{
    static class B{
        static void show(){
            System.out.println("This is static method inside a static class");
        }
    }
}

public class Static6 {
    public static void main(String[] args) {
        A.B.show();
    }
}

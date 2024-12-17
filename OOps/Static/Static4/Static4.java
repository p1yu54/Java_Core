// Nesting of class and making static method inside the inner class

class A{
    class B{
        static void show(){
            System.out.println("This is static method inside the inner class B");
        }
    }
}

public class Static4 {
    public static void main(String[] args) {
        A.B.show();
    }
}

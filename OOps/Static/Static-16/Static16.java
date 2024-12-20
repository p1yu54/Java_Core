// Multiple nesting of static classes inside another class

class A{
    static class B{
        static class C{
            static void show(){
                System.out.println("This is static show method inside static class C");
            }
        }
    }
}

public class Static16 {
    public static void main(String[] args) {
        A.B.C.show();
    }
}

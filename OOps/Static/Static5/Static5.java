// Nesting classes , making static method as well as static instance variable in the inner class

class A{
    class B{
        static int a = 12;
        static void show(){
            System.out.println("The value of a = " + a);
        }
    }
}
public class Static5 {
    public static void main(String[] args) {
        A.B.show();
    }
}

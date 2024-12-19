// Nesting of interface and class inside a class and accessing their methods in main method

class A{
    interface B{
        void show();
    }

    class C{
        void show2(){
            System.out.println("This is the method of the nested inner class");
        }
    }
}

public class Static13 {
    public static void main(String[] args) {
        A.B b = new A.B(){
            public void show(){
                System.out.println("This is the method of the interface inside the class");
            }
        };

        b.show();

        A.C c = new A().new C();
        c.show2();
    }
}

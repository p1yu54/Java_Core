// Nesting of interface and class inside a class and accessing their methods in main method

class A{
    interface B{
        void show();
    }

    static class C{
        static void show2(){
            System.out.println("This is the method of the nested inner class");
        }
    }
}

public class Static14 {
    public static void main(String[] args) {
        A.B b = new A.B(){
            public void show(){
                System.out.println("This is the method of the interface inside the class");
            }
        };

        b.show();

        A.C.show2();
    }
}

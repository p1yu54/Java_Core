// Making an interface and a class inside an interface and accessing their methods in the main method

interface A{
    interface B{
        default void show(){
            System.out.println("This is method the interface B");
        }
    }

    class C{
        void show2(){
            System.out.println("This method of the class C");
        }
    }
}

public class Static17 {
    public static void main(String[] args) {
        A.B b = new A.B(){

        };
        b.show();

        A.C c = new A.C();
        c.show2();
    }
}

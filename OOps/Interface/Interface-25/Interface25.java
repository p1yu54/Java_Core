// Nesting multiple interfaces and accessing them into another class

interface A{
    void show();
    interface B{
        void show1();
        interface C{
            void show2();
            interface D{
                void show3();
            }
        }
    }
}

class E implements A , A.B , A.B.C , A.B.C.D{
    public void show(){
        System.out.println("This is show mehtod in interface A");
    }
    public void show1(){
        System.out.println("This is show1 method in interface B");
    }
    public void show2(){
        System.out.println("This is show2 method in interface C");
    }
    public void show3(){
        System.out.println("This is show3 method in interface D");
    }
}

public class Interface25 {
    public static void main(String[] args) {
        E e = new E();
        e.show();
        e.show1();
        e.show2();
        e.show3();
    }
}   

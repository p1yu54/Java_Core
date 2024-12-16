// Nesting an interface inside another interface and access both of their methods 

interface A{
    interface B{
        void show1();
        void show2();
    }
    void show3();
}
class C implements A, A.B{
    public void show1(){
        System.out.println("This is method 1 inside nesting of interface B");
    }
    public void show2(){
        System.out.println("This is mehthod 2 inside nesting of interface B");
    }

    public void show3(){
        System.out.println("This is method 3 inside interface A");
    }
}

public class Interface19 {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        p.show2();
        p.show3();
    }
}

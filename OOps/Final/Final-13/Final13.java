// Making multiple final as well as non-final methods in another class

final class A{
    final void show1(){
        System.out.println("This is final method show1");
    }
    void show2(){
        System.out.println("This is non-final method show2");
    }
    final void show3(){
        System.out.println("This is final method show3");
    }
    void show4(){
        System.out.println("This is non-final method show4");
    }
}

public class Final13 {
    public static void main(String[] args) {
        A a = new A();
        a.show1();
        a.show2();
        a.show3();
        a.show4();
    }
}

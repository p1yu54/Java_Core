// Making multiple final methods in another final class

final class A{
    final void show1(){
        System.out.println("This is show1 method");
    }
    final void show2(){
        System.out.println("This is show2 method");
    }
    final void show3(){
        System.out.println("This is show3 method");
    }
    final void show4(){
        System.out.println("This is show4 method");
    }
}

public class Final12 {
    public static void main(String[] args) {
        A a = new A();
        a.show1();
        a.show2();
        a.show3();
        a.show4();
    }
}

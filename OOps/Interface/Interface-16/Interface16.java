// Nesting an interface inside a class and accessing interface's methods

class A{
    interface B{
        void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("This is inteface method in class");
    }
}

public class Interface16 {
    public static void main(String[] args) {
        C p = new C();
        p.show();
    }
}

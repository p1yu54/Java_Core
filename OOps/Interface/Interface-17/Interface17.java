// Nesting an interface inside another interface 

interface A{
    interface B{
        void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("This is interface inside interface");
    }
}

public class Interface17 {
    public static void main(String[] args) {
        A.B p = new C();
        p.show();
    }
}

// Nesting an interface inside another interface and access both of their methods 

interface A{
    interface B{
        void show1();
    }
    void show2();
}
class C implements A,A.B{
    public void show1(){
        System.out.println("This is mehthod of interface B");
    }
    public void show2(){
        System.out.println("This is mehtod o interface A");
    }
}

public class Interface18 {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        p.show2();   
    }    
}

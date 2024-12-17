// Nesting multiple interfaces and accessing them into another class

interface A{
    interface B{
        interface C{
            interface D{
                void show(int num);
            }
        }
    }
}
class E implements A.B.C.D{
    public void show(int num){
        System.out.println("The value of num = " + num);
    }
}

public class Interface24 {
    public static void main(String[] args) {
        E p = new E();
        p.show(12);
    }   
}

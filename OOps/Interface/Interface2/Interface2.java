// Making two interfaces containing multiple methods with differernt return type and arguments

interface A{
    void show1();
    void show2(int a , int b);
}
interface B{
    int show3();
    int show4(int a , int b);
}

class C implements A,B{
    public void show1(){
        System.out.println("This is method one of interface A");
    }
    public void show2(int a , int b){
        System.out.println("The sum of " + a + " + " + b + "=" + (a+b));
    }
    public int show3(){
        int a = 12;
        System.out.println(a);
        return a;
    }
    public int show4(int a , int b){
        System.out.println(a + "*" + b + " = " + a*b);
        return a*b;
    }
}

public class Interface2 {
    public static void main(String[] args) {
        C p = new C();
        p.show1();
        p.show2(11, 12);
        p.show3();
        p.show4(10, 12);
    }
}

// Making an interface consisting multiple methods with differernt types of return type and argument

interface A{
    void show1();
    void show2(int a);
    int show3();
    int show4(int a);
}
class B implements A{
    public void show1(){
        System.out.println("Hello World");
    }
    public void show2(int a){
        System.out.println("The value of a is " + a);
    }
    public int show3(){
        int a = 12;
        System.out.println("The value of a is " + a);
        return a;
    }
    public int show4(int a){
        System.out.println("The value of a is " + a);
        return a;
    }
}

public class Interface1{
    public static void main(String[] args) {
        B p = new B();
        p.show1(); 
        p.show2(11); 
        p.show3(); 
        p.show4(13); 
    }
}
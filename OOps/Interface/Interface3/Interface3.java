// Achieveing Mutiple Inheritance through interface in java 

interface A{
    void show1();
}
interface B{
    void show2(String name);
}
interface C{
    int show3();
}
interface D{

    int show4(int a);
}
class E implements A,B,C,D{
    public void show1(){
        System.out.println("Achieving multiple inheritance from interface");
    }
    public void show2(String name){
        System.out.println("My name is " + name);
    }
    public int show3(){
        int a = 12;
        System.out.println("The square of a is " + a*a );
        return a;
    }
    public int show4(int a){
        System.out.println("The value of a is set to " + a);
        return a;
    }
}
public class Interface3 {
    public static void main(String[] args) {
        E p = new E();
        p.show1();
        p.show2("Piyush");
        p.show3();
        p.show4(3);
    }
}
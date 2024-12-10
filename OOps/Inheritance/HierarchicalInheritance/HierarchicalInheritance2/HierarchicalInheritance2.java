// Achieveing Hierarichical Inheritance as well as making getter setter method in each class and accessing them in the main class

class A{
    int A ;
    void setA(int A){
        this.A = A;
    }
    int getA(){
        return A;
    }
}
class B extends A{
    int B ;
    void setB(int B){
        this.B = B;
    }
    int getB(){
        return B;
    }
}
class C extends A {
    int C ;
    void setC(int C){
        this.C = C;
    }
    int getC(){
        return C;
    }
}
class D extends A {
    int D ;
    void setD(int D){
        this.D = D;
    }
    int getD(){
        return D;
    }
}
class E extends A  {
    int E ;
    void setE(int E){
        this.E = E;
    }
    int getE(){
        return E;
    }
}
public class HierarchicalInheritance2 {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        b.setA(1);
        b.setB(2);
        System.out.println(b.getA());
        System.out.println(b.getB());

        c.setA(3);
        c.setC(4);
        System.out.println(c.getA());
        System.out.println(c.getC());

        d.setA(5);
        d.setD(6);
        System.out.println(d.getA());
        System.out.println(d.getD());

        e.setA(7);
        e.setE(8);
        System.out.println(e.getA());
        System.out.println(e.getE());
    }
}

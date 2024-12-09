// Achieveing Multi-Level Inheritance and as well as making getter setter method in all the classes and accessing them in the main clas
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
    int B;
    void setB(int B){
        this.B = B;
    }
    int getB(){
        return B;
    }
}
class C extends B{
    int C;
    void setC(int C){
        this.C = C;
    }
    int getC(){
        return C;
    }
}
class D extends C{
    int D ;
    void setD(int D){
        this.D = D;
    }
    int getD(){
        return D;
    }
}
class E extends D{
    int E ;
    void setE(int E){
        this.E = E;
    }
    int getE(){
        return E;
    }
}
class F extends E{
    int F;
    void setF(int F){
        this.F = F;
    }
    int getF(){
        return F;
    }
}
public class MultiLevelInheritance4 {
    public static void main(String[] args) {
        F f = new F();
        f.setA(1);
        f.setB(2);
        f.setC(3);
        f.setD(4);
        f.setE(5);
        f.setF(6);

        System.out.println(f.getA());
        System.out.println(f.getB());
        System.out.println(f.getC());
        System.out.println(f.getD());
        System.out.println(f.getE());
        System.out.println(f.getF());
    }   
}

// Achieveing Hierarchical Inheritance making instance variable and printing all the varibales and accesing them in main class
class A{
    int A = 1;
}
class B extends A{
    int B = 2;
    void displayB(){
        System.out.println(A+B);
    }
}
class C extends A{
    int C = 3;
    void displayC(){
        System.out.println(A+C);
    }
}
class D extends A{
    int D = 4;
    void displayD(){
        System.out.println(A+D);
    }
}
class E extends A{
    int E = 5;
    void displayE(){
        System.out.println(A+E);
    }
}
public class HierarchicalInheritance3 {
    public static void main(String[] args) {
        new B().displayB();
        new C().displayC();
        new D().displayD();
        new E().displayE();
    }
}

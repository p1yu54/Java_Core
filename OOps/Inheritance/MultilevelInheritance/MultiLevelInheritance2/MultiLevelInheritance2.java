// Achieveing Multi-Level Inheritance with multiple classes and accessing them in the main class through child class's object

class A{
    int show1(int num){
        System.out.println("The value of num in class A = " + num);
        return num;
    }
}
class B extends A{
    void show2(){
        System.out.println("This is show2 method in B class");
    }
}
class C extends B{
    int show3(){
        int a = 12 ;
        System.out.println("The value of a = " + a);
        return a;
    }
}
class D extends C{
    int show4(int num){
        System.out.println("The value of num in class D = " + num);
        return num;
    }
}
class E extends D{
    int show5(){
        int  b = 23;
        System.out.println("The value of b = " + b);
        return b;
    }
}
class F extends E{
    F show6(){
        System.out.println("This is F class method");
        return this;
    }
}
public class MultiLevelInheritance2 {
    public static void main(String[] args) {
        F f = new F();
        System.out.println(f.show1(1234));
        f.show2(); 
        System.out.println(f.show3()); 
        System.out.println(f.show4(233));
        System.out.println(f.show5()); 
        System.out.println(f.show6());; 
    }
}

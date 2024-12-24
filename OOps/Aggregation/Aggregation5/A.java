// Achieveing Multi-Level Inheritance 

class B{
    void show(){
        System.out.println("This is method of B class");
    }
}
class C extends B{
    void show1(){
        System.out.println("This is the method of C class");
    }
}
public class A extends C {
    void show2(){
        System.out.println("This is method of A Class");
    }
}

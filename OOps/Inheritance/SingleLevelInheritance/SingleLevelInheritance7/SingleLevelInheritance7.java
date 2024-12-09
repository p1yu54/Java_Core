// Making a protected mehtod in parent class as well as the in the child class and accessing it in the main class

class A{
    protected void show(){
        System.out.println("This is protected method in class A");
    }
}
class B extends A{
    protected void show1(){
        System.out.println("This is protected method in class B");
    }
}
public class SingleLevelInheritance7 {
    public static void main(String[] args){
        B b = new B();
        b.show();
        b.show1();
    }
}

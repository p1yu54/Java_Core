//Making default constructor in parent as well as the child class and accessing it in main class
class A{
    A(){
        System.out.println("This is A class constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is B class constructor");
    }
}
public class SingleLevelInheritance9 {
    public static void main(String[] args) {
        new B();   
    }
}

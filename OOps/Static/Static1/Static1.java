// Declaring and accessing static and non static varibales in another class

class A{
    static int a = 12;
    int b = 45;

    void show(){
        System.out.println("The value of a = " + a);
        System.out.println("The value of b = " + b);
    }
}

public class Static1{
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}
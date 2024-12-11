// Problem : Overloading method with same number of parameter

class A{
    void show(int num){
        System.out.println("The value of num = " + num);
    } 

    void show(int num){ // This will throw error
        System.out.println("The square of " + num + " = " + (num * num));
    }
}

public class Polymorphism1{
    public static void main(String[] args) {
        A a = new A();
        a.show(12);
    }
}
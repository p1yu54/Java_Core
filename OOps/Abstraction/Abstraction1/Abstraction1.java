// Making abstract class as well as abstract methods with different parameters and return types

abstract class A{
    //This method is with no argument and no return type
    abstract void show1();
    
    // This method is with argument and with no return type
    abstract void show2(int num);

    // this method is with return and no argument
    abstract int show3();
    
    // This mehtod is with return and argument
    abstract int show4(int num);

    // This mehtod is covariant return type
    abstract A show5();
}

class B extends A{

    public void show1(){
        System.out.println("This is abstract method of class A");
    }

    public void show2(int num){
        System.out.println("The value of num = " + num);
    }

    public int show3(){
        int num = 123;
        return num;
    }

    public int show4(int num){
        System.out.println("The square of num = " + (num * num));
        return num;
    }

    public A show5(){
        System.out.println("This is covariant return type method`");
        return this;
    }
}

public class Abstraction1{
    public static void main(String[] args) {
        B b = new B();
        b.show1();
        b.show2(123);
        b.show3();
        b.show4(123);
        b.show5();
    }
}
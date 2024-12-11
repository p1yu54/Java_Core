// Solution : Changing the number of parameter inside the method to solve the problem of method overloading

class A{
    void show(){
        int num = 12;
        System.out.println("The value of num = " + num);
    } 

    void show(int num){ // This will throw error
        System.out.println("The square of " + num + " = " + (num * num));
    }
}

public class Polymorphism2{
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show(23);    
    }
}
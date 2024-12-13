// Constructor chaining and accesing them by super keyword
class A{
    A(int a){ // This is the first constructor
        this(12,13);
        System.out.println("The value of a = " + a);
    }
    A(){ // This is the second constructor
        System.out.println("This is the second constructor");
    }
    A(int a , int b){ // This is third constructor
        this("Piyush" , 18);
        System.out.println(a + " + " + b + " = " + (a+b));
    }
    A(String name , int age){ // This is the fourth constructor
        this(11232,'c');
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
    A(String of5){ // This is the fifth constructor
        this(1);
        System.out.println(of5);
    }
    A(int id , char idChar){ // This is the sixth constructor
        this();
        System.out.println("My id is " + idChar + id);
    }
}
public class Polymorphism13 {
    public static void main(String[] args) {
        new A("this is 5");
    }
}

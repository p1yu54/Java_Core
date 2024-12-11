// Achieveing Hierarchical Inheritance as well as well overloading methods
class A{
    void show(){
        System.out.println("This is show method in class A");
    }

    void show(int num){
        if(num % 2 == 0){
            System.out.println(num + " is even number");
        }
        else{
            System.out.println(num + " is odd number");
        }
    }
} 
class B extends A{
    void show1(String name){
        System.out.println("My name is " + name);
    }
    void show1(int age){
        System.out.println("My age is " + age);
    }
} 
class C extends A{
    int show2(int num){
        boolean flag = true ;
        for(int i = 2 ; i < num ; i++){
            if(num % i != 0){
                flag = true ;
                break;
            }
            else{
                flag = false ;
                break;
            }
        }
        if(flag){
            return num;
        }
        else{
            return 0;
        }
    }

    int show2(){
        int num = 12;
        System.out.println("The value of num = " + num);
        return num ;
    }
}
class D extends A{
    void show3(){
        System.out.println("This is show3 method in class D");
    }
    void show3(String id){
        System.out.println("My id " + id);
    }
}
public class Polymorphism8 {
    public static void main(String[] args) {
        // Making object of B class and calling A class methods and B class as well
        B b = new B();
        b.show();
        b.show(12);
        b.show1("Piyush");
        b.show1(18);
       
        // Making object of C class and calling A class method and C class as well
        C c = new C();
        c.show();
        c.show(123);
        c.show2();
        c.show2(23342);
       
        // Making object of D class and calling A class methods and D class as well
        D d = new D();
        d.show();
        d.show(12);
        d.show3();
        d.show3("My1223");

    }
}

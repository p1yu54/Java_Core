// Achieveing Mult-Level Inheritance as well as well overloading methods

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
class C extends B{
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
class D extends C{
    void show3(){
        System.out.println("This is show3 method in class D");
    }
    void show3(String id){
        System.out.println("My id " + id);
    }
}
public class Polymorphism7{
    public static void main(String[] args) {
        D d = new D();
        d.show();
        d.show(12);
        d.show1("Piyush");
        d.show1(18);
        d.show2(12);
        d.show2();
        d.show3();
        d.show3("My1223");

    }
}

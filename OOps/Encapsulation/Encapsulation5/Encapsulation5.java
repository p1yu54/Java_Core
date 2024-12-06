//Making and calling constructor as well as the extra methods in another class

class A{
    A(){
        System.out.println("This is constructor of A class");
    }
    void show(){
        System.out.println("This is the method of A class");
    }
    A show1(){
        System.out.println("This method return type is covariant");
        return this;
    }  
    void show2(int num){
        System.out.println("The value of num :- " + num);
    }
    String show3(){
        String str = "Hello World";
        System.out.println("This method returns string");
        return str;
    }
}
public class Encapsulation5 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show1();
        System.out.println(a.show1());
        a.show2(34);
        a.show3();
        System.out.println(a.show3());
    }    
}

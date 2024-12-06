//Making and calling constructor as well as the extra methods in another class while passing the argumenst 

class A{
    A(int a){
        System.out.println("The value of a " + a);
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
public class Encapsulation8 {
    public static void main(String[] args) {
        A a = new A(12);
        a.show();
        System.out.println(a.show1());
        a.show2(34);
        System.out.println(a.show3());
    }    
}
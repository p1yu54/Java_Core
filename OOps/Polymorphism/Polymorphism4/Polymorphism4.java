// Solution : Changing the return type as well as the number of parameter of the methods

class A{
    void show(){
        System.out.println("This is show method ");
    }
    int show(int num){
        System.out.println("The value of num = " + num);
        return num;
    }
}

public class Polymorphism4 {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        a.show(232);
    }
}

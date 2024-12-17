// Making static instance variable and a static method and accessng the static variable in the static method in another class

class A{
    static int a = 435;

    static void show(){
        System.out.println("The value of a = " + a);
    }
}
public class Static2 {
    public static void main(String[] args) {
        A.show();
    }
}

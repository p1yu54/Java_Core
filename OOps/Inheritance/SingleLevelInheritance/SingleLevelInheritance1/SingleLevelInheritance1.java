class A{
    void show(){
        System.out.println("This is the method of class A");
    }
    void show1(int a){
        System.out.println("The value of a = " + a);
    }
}
class B extends A{
    int show2(){
        int a = 12;
        System.out.println("The value of a = " + a);
        return a;
    }
    boolean show3(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
            return true;
        }
        else{
            System.out.println(num + " is not odd number");
            return false;
        }
    }

    B show4(){
        System.out.println("This is covariant method");
        return this;
    }
}
public class SingleLevelInheritance1 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
        b.show1(132);
        b.show2();
        b.show3(1324);
        b.show4();
    }    
}

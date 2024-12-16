// Extending an interface to another interface

interface A{
    default void table(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " X " + i + "=" + (num * i));
        }
    }
}
interface B extends A{
    default void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
    }
}
interface C extends B{
    default void square(int num){
        System.out.println("The square of " + num + " = " + (num * num));
    }
}
interface D extends C{
    default void DivisibleByThree(int num){
        if(num % 3 == 0){
            System.out.println(num + " is divisible by three");
        }
        else{
            System.out.println(num + " is not divisible by three");
        }
    }
}
class E implements D{
    void show(){
        System.out.println("This class will call all the interfaces");
    }
}
public class Interface7 {
    public static void main(String[] args) {
        E p = new E();
        p.table(158);
        p.EvenOdd(26869);
        p.square(1523);
        p.DivisibleByThree(9912);
    }
}

// Applying RunTime Stack Mechanism(Exception) in multiple methods with try catch in main method

public class Exception3 {
    static void method1(){
        int a = 9 / 0;
        System.out.println(a);
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
    }
    static void method4(){
        method3();
    }
    static void method5(){
        method4();
    }

    public static void main(String[] args) {
        try{
            method5();
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
    }
}

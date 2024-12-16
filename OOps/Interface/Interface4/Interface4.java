// Extending one interface to another interface
interface A{
    void show1();
}
interface B extends A{
    void show2(int a);
}
interface C extends B{
    int show3();
}
interface D extends C{
    int show4(int a);
}
class E implements D{
    public void show1(){
        System.out.println("Extending one interface to another interface");
    }
    public void show2(int a){
        boolean flag = true;
        for(int i = 2 ; i < a ; i++){
            if(a % i != 0){
                flag = true;
                break;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(a + " is a Prime Number");
        }
        else{
            System.out.println(a + " is not a Prime Number");
        }
    }
    public int show3(){
        int a = 12;
        int square = a * a;
        System.out.println("The square of " + a + " = " + square);
        return square;
    }
    public int show4(int a){
        int rem , rev = 0;
        for(int temp = a ; temp != 0 ; temp /= 10 ){
            rem = temp % 10;
            rev = (rev * 10) + rem;
        }
        System.out.println("The reverse of " + a + " is " + rev);
        return rev;
    }
}
public class Interface4 {
    public static void main(String[] args) {
        E p = new E();
        p.show1(); 
        p.show2(7);
        p.show3();
        p.show4(123);  
    }
}

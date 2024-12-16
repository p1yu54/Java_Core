// Making and accessing parameterised constructor of a class inside an interface

interface A{
    class B{
        B(int a){
            boolean flag = true;
            for(int i = 2 ; i < a; i++){
                if(a % i != 0){
                    flag = true;
                    break;
                }
                else{
                    flag = false ;
                    break;
                }
            }
            if(flag){
                System.out.println(a + " is a prime number");
            }
            else{
                System.out.println(a + " is not a prime number");
            }
        }
    }
}
class C extends A.B{
    C(int a){
        super(a);
        System.out.println("The value of a = " + a);
    }
}

public class Interface13 {
    public static void main(String[] args) {
        int a = 13;
        new C(a);  
    }
}

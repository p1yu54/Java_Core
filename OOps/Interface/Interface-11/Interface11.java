// Making a class inside an interface and accessing its methods(Nesting Class and Interface)

interface A{
    class B{
        void show1(){
            System.out.println("This is class B");
        }
        int show2(int num){
            if(num % 2 ==0){
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is and odd number");
            }
            return num;
        }
    }
    default void show3(){
        System.out.println("This is the method of the interface");
    }
    default int show4(int num){
        int count = 0;
        for(int temp = num ; temp != 0 ; temp /= 10){
            count++;
        }
        System.out.println("The number of digits in "+ num + " = " +count);
        return count;
    }
}

class C extends A.B implements A{

}

public class Interface11 {
    public static void main(String[] args) {
        //Making a reference variable to access the methods of the class B inside interface A
        A.B p = new C();
        p.show1();
        p.show2(2424536);

        // Making a reference vairable to access the methods of the interface A
        A k = new C();
        k.show3();
        k.show4(1231231);
    }
}

// Nesting of classes inside single class and accessing their methods in main method

class A{
    class B{
        void show1(){
            System.out.println("This is show one method in the inner class B");
        }
        void show2(int num){
            if(num % 2 == 0){
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is an odd number");
            }
        }
    }

    class C{
        int show3(){
            System.out.println("This method will return 0");
            return 0;
        }

        boolean show4(int num){
            if(num % 2 == 0){
                return true;
            }
            else{
                return false;
            }
        }
    }
}

public class Static10 {
    public static void main(String[] args) {

        A.B b = new A().new B();
        b.show1();
        b.show2(342);

        A.C c = new A().new C();
        c.show3();
        System.out.println(c.show4(78696));
    }
}

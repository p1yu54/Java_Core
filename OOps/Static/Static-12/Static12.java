//  Nesting of classes static as well as non-static class inside single class and (making instance variable and method)accessing their static and non-static methods in main method

class A{
    static class B{
        //static instance variable of class B
        static int a = 12;

        // static method show1
        static void show1(){
            System.out.println("The value of static instance variable = " + a);
        }

        //static method show2
        static int show2(){
            System.out.println("This method return the static instance variable");
            return a;
        }
    }

    class C{
        //static instance variable of class C
        static int c = 67;

        //static method show3
        static void show3(int num){
            if(num % 2 == 0){
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is an odd number");
            }
        }

        //non-static method show4
        int show4(int num){
            System.out.println(num + " * " + c + " = " + (num * c));
            return (num*c);
        }

    }
}

public class Static12 {
    public static void main(String[] args) {
        A.B.show1();
        A.B.show2();

        A.C.show3(546);
        new A().new C().show4(98);
    }
}

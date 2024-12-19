// Nesting of classes static as well as non-static class inside single class and accessing their static ans non-static methods in main method

class A{
    static class B{
        static void show1(){
            System.out.println("This is a static method in static class B");
        }

        static int show2(){
            int a = 12 ;
            System.out.println("The value of a = " + a);
            return a;
        }
    }

    class C{
        static void show3(int num){
            if(num % 2 == 0){
                System.out.println(num + " is an even number");
            }
            else{
                System.out.println(num + " is an odd number");
            }
        }

        int show4(int num){
            System.out.println("This method will return = " + num);
            return num;
        }
    }
}

public class Static11 {
    public static void main(String[] args) {
        
        A.B.show1();
        A.B.show2();

        A.C c = new A().new C();
        c.show3(34);
        c.show4(324);
    }
}

// Declaring methods inside interface and accessing them through anonymous inner class in main method

interface A{
    void show1();
    void show2(int a);
    int show3();
    int show4(int a);
}
public class AnonymousInnerClass1{
    public static void main(String[] args) {
        //Anonymous Inner class 
        A a = new A(){
            public void show1(){
                System.out.println("This is anonymous inner class");
            }

            public void show2(int a){
                System.out.println("The value of a = " + a);
            }

            public int show3(){
                int a = 123;
                return a;
            }

            public int show4(int a){
                System.out.println("This method is returning the value of a which is = " + a);
                return a;
            }
        };
        a.show1();
        a.show2(546);
        System.out.println(a.show3());
        a.show4(4351);
    }
}
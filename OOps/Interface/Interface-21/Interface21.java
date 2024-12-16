// Making and accessing default and protected methods inside interfaces as well as nesting them 

interface A{
    interface B {
        protected void show(){
            System.out.println("This is protected method"); // This will throw an error
        }
    }
    default void show1(){
        System.out.println("This is interface A");
    }
}
class C implements A.B , A{
      
}

public class Interface21 {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.show1();
    }
}

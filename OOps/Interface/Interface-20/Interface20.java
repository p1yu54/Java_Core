// Making and accessing private and protected method inside an interface while they are nested

interface A{
    interface B{
        protected void show(){
            System.out.println("This method is private");//this will throw an error
        }
    }
    private void show1(){
        System.out.println("This method is private");//this will not be called because the method is private
    }
}
class C implements A , A.B {

}

public class Interface20 {
    public static void main(String[] args) {
        A.B p = new C();
        p.show();

        A k = new C();
        k.show1();
    }
}

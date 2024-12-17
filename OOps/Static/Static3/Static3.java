// Making and acceessing a static block 
class A{
    static{
        System.out.println("This is static block inside class A");
    }
}
public class Static3 {
    public static void main(String[] args) {
        new A();
    }
}
 
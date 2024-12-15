// Overriding methods with same name as well as same types of parameters

class A{
    void displayData(String id){
        System.out.println(id);
    }
}

class B extends A{
    void displayData(String id){
        System.out.print("My id is ");
        super.displayData(id);
    }
}
public class Polymorphism17 {
    public static void main(String[] args) {
        new B().displayData("Piyush123");
    }
}

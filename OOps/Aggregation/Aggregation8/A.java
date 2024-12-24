// Making a Abstract class and extending to another class 

abstract class AB{
    abstract void show();
}

public class A extends AB{
    public void show(){
        System.out.println("This is abstract method");
    }
}

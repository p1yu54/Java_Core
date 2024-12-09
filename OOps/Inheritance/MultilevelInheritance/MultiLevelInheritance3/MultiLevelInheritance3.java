// Achieveing Multi-Level Inheritance with multiple classes (making their constructor)and accessing them in the main class through child class's object

class A{
    A(){
        System.out.println("This is A class constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is B class constructor");
    }
}
class C extends B{
    C(){
        System.out.println("This is C class constructor");
    }
}
class D extends C{
    D(){
        System.out.println("This is D class consotructor");
    }
}
class E extends D{
    E(){
        System.out.println("This is E class constructor");
    }
}
class F extends E{
    F(){
        System.out.println("This is F class constructor");
    }
}
public class MultiLevelInheritance3 {
    public static void main(String[] args) {
        new F();
    }
}

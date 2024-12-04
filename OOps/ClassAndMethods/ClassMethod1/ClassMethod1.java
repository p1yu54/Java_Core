// Making a method that is returning int , double , Strng in another class

import java.lang.reflect.Method;

class Methods{
    //This method will reutrn an integer
    int showInteger(){
        int num = 12;
        return num;
    }

    //This method will return a double
    double showDouble(){
        double num = 12.4;
        return num;
    }

    //This method will return a String
    String showStiring(){
        String str = "Hello World";
        return str;
    }

    Methods showCovariant(){
        System.out.println("This is covariant method");
        return this;
    }
}

public class ClassMethod1{
    public static void main(String[] args) {
        Methods obj = new Methods();

        System.out.println(obj.showInteger());
        System.out.println(obj.showDouble());
        System.out.println(obj.showStiring());
        System.out.println(obj.showCovariant());
    }
}


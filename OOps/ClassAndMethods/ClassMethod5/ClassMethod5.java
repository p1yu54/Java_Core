// Making classes for each method like addition subtraction , multiplication , division and mod and making in covariant return type

class Add{
    Add add(){
        int num1 = 12 , num2 = 13; 
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        return this;
    }
}
class Subtraction{
    Subtraction subtract(){
        int num1 = 123 , num2 = 13;
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        return this;
    }
}

class Multiplication{
    Multiplication multipy(){
        int num1 = 123 , num2 = 13;
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        return this;
    }
}

class Divide {
    Divide divide(){
        int num1 = 123 , num2 = 13;
        System.out.println(num1 + "  " + num2 + " = " + (num1 / num2));
        return this;
    }
}

class Mod{
    Mod mod(){
        int num1 = 123 , num2 = 13;
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        return this;
    }
}
public class ClassMethod5 {
    public static void main(String[] args) {
        Add a = new Add();
        System.out.println(a.add());

        Subtraction s = new Subtraction();
        System.out.println(s.subtract());

        Multiplication m = new Multiplication();
        System.out.println(m.multipy());

        Divide d = new Divide();
        System.out.println(d.divide());

        Mod mo = new Mod();
        System.out.println(mo.mod());
    }
}

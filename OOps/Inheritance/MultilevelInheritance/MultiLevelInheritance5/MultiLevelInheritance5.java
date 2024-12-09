// Making instance variable in six classes as well as extending them and at the last class calculating the sum of all the instance variables

class A{
    int A = 1;
}
class B extends A{
    int B = 2;
}
class C extends B{
    int C = 3;
}
class D extends C{
    int D = 4;
}
class E extends D{
    int E = 5;
}
class F extends E{
    int F = 6;
    void sum(){
        System.out.println(A+B+C+D+E+F);
    }
}
public class MultiLevelInheritance5 {
    public static void main(String[] args) {
        new F().sum();
    }
}

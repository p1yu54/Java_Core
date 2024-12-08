// Making two instance variable in a class as well as their getter and setter methods and passing it to another class printing those variables

class A{
    int num1 ;
    int num2 ;
    void setNum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    int getNum1(){
        return num1;
    }
    int getNum2(){
        return num2; 
    }
}
class B extends A{
    void displyNum(){
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);
    }
}
public class SingleLevelInheritance3 {
    public static void main(String[] args) {
        B b = new B();
        b.setNum(1, 2);
        b.displyNum();
        System.out.println(b.getNum1() + " " + b.getNum2());
    }
}

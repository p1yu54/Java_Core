//Making four instance variable in a class as well as their getter and setter methods and passing it to another class printing those variables
class A{
    int num1 , num2 , num3 , num4;
    void setNum(int num1, int num2 , int num3 , int num4){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }
    int getNum1(){
        return num1;
    }
    int getNum2(){
        return num2; 
    }
    int getNum3(){
        return num3;
    }
    int getNum4(){
        return num4; 
    }
}
class B extends A{
    void displyNum(){
        System.out.println("The value of num1 = " + num1);
        System.out.println("The value of num2 = " + num2);
        System.out.println("The value of num3 = " + num3);
        System.out.println("The value of num4 = " + num4);
    }
}
public class SingleLevelInheritance4 {
    public static void main(String[] args) {
        B b = new B();
        b.setNum(1, 2 ,3 ,4);
        b.displyNum();
        System.out.println(b.getNum1() + " " + b.getNum2() + " " + b.getNum3() + " " + b.getNum4());
    }
}

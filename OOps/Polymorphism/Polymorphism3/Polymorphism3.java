// Problem : Overloading method with same return type 

class A{
    int show(int num){
        System.out.println("The value of num = " + num);
    }

    int show(int num){// This will throw error
        if(num % 2 == 0){
            return num;
        }
        else{
            return 0;
        }
    }
}

public class Polymorphism3 {
    public static void main(String[] args) {
        A a = new A();
        a.show(34);
        a.show(3124);

    }
}

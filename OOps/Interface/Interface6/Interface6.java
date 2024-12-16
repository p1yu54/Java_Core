// Achieveing Multiple Inheritance with the help of interface


interface A{
    void table(int num);
}
interface B{
    void EvenOdd(int num);
}
interface C{
    void square(int num);
}
interface D{
    void DivisibleByThree(int num);
}
class E implements A,B,C,D{
    
    //Defining the mehtod of interface A(table())
    public void table(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " X " + i + "=" + (num * i));
        }
    }

    //Defining the method of interface B(EvenOdd())
    public void EvenOdd(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
        }
        else{
            System.out.println(num + " is an odd number");
        }
    }

    //Defining the mehtod of interface C(square())
    public void square(int num){
        System.out.println("The square of " + num + " = " + (num * num));
    } 

    //Defining the method of interfaceB(DivisibleByThree())
    public void DivisibleByThree(int num){
        if(num % 3 == 0){
            System.out.println(num + " is divisible by three");
        }
        else{
            System.out.println(num + " is not divisible by three");
        }
    }

    // Method of class E
    void show(){
        System.out.println("This class will call all the interfaces");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        E p = new E();
        p.table(144);
        p.EvenOdd(1908);
        p.square(156);
        p.DivisibleByThree(99);
    }
}

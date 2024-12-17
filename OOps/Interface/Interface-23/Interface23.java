// Making and access method of an interface inside a class also consisting its parammterised constructor

import java.util.Scanner;

class A{
    A(int num){
        boolean flag = true;
        for(int i = 2 ; i < num ; i++){
            if(num % i != 0){
                flag = true;
                break;
            }
            else{
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
    interface B{
        void show();
    }
}
class C extends A implements A.B{
    C(int i){
        super(i);
    }
    public void show(){
        System.out.println("This is interface method");
    }
}

public class Interface23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of i :- ");
        int i = sc.nextInt();
        
        C p = new C(i);
        p.show();
    }   
}

// Making a class inside an interface and accessing its methods(Nesting Class and Interface)

import java.util.Scanner;

interface A{
    class B{
        void show(){
            System.out.println("Hello World");            
        }
        int show1(int a){
            System.out.println("The value of a = " + a);
            return a;
        }
    }
}

class C extends A.B{
    
}

public class Interface10 {
    public static void main(String[] args) {
                
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a :- ");
        int a = sc.nextInt();


        C c = new C();
        c.show();
        c.show1(a);
    }
}

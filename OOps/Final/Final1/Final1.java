// Making a Final class a non-final method in the class and accessing the method in main method

final class A{
    void table(int num){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}

public class Final1 {
    public static void main(String[] args) {
        A a = new A();
        a.table(12);
    }
}

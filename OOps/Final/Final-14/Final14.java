// Making multiple final methods in another class

final class A{
    final boolean show1(int num){
        if(num % 2 == 0){
            System.out.println(num + " is an even number");
            return true;
        }
        else{
            System.out.println(num + " is and odd number");
            return false;
        }
    }

    int show2(int num){
        boolean flag = true ;
        for(int i = 2 ; i < num ; i++){
            if(num % i != 0){
                flag = true ;
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
        return num;
    }

    final void show3(){
        System.out.println("This is non-final method show3");
    }

    int show4(int num){
        System.out.println("This method will return " + num);
        return num;
    }
}

public class Final14 {
    public static void main(String[] args) {
        A a = new A();

        int num = 78;

        a.show1(num);
        a.show2(num);
        a.show3();
        a.show4(num);
    }
}

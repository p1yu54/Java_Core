// Achieveing Single Level Inheritance as well as well overloading methods 



class C{
    int show2(int num){
        boolean flag = true ;
        for(int i = 2 ; i < num ; i++){
            if(num % i != 0){
                flag = true ;
                break;
            }
            else{
                flag = false ;
                break;
            }
        }
        if(flag){
            return num;
        }
        else{
            return 0;
        }
    }

    int show2(){
        int num = 12;
        System.out.println("The value of num = " + num);
        return num ;
    }
}
class D extends C{
    void show3(){
        System.out.println("This is show3 method in class D");
    }
    void show3(String id){
        System.out.println("My id " + id);
    }
}
public class Polymorphism6 {
    public static void main(String[] args) {
        D d = new D();
        d.show2(12);
        d.show2();
        d.show3();
        d.show3("My1223");

    }
}

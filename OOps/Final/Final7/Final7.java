// Making non-final method in final classs(with passing parameters)

final class A{
    void show(int num){
        System.out.println("The value of num = " + num);
    }
}

public class Final7 {
    public static void main(String[] args) {
        new A().show(87);
    }
}

// Printing even number in reverse from an array {1,2,3,4,5,6,7,8,9,10}

public class Array11 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = a.length -1 ; i >= 0 ; i--){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}

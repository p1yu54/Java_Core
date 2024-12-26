// Printing sequence : 1,3,5,7,9 from array {1,2,3,4,5,6,7,8,9,10}

public class Array10 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] % 2 != 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}

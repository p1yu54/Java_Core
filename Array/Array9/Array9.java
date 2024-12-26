// Printing sequence : 2 4 6 8 10 from array {1,2,3,4,5,6,7,8,9,10}

public class Array9 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < a.length ; i++){
            if(i % 2 != 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}

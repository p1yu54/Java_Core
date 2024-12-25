// Printing the sequence : 5 4 3 2 1 6 7 8 9 10

public class Array3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = ((a.length - 1) / 2) ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }
        for(int i = (a.length / 2) ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
    }
}
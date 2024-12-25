// Print sequence : 5 4 3 2 1 10 9 8 7 6 

public class Array5 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = ((a.length - 1) / 2) ; i >= 0 ; i--){
            System.out.print(a[i] + " ");
        }

        for(int i = (a.length - 1) ; i >= (a.length / 2) ; i--){
            System.out.print(a[i] + " ");
        }
    }
}

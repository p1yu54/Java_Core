// Print sequence : 1 2 3 4 5 10 9 8 7 6

public class Array4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < (a.length / 2) ; i++){
            System.out.print(a[i] + " ");
        }
        for(int i = (a.length -1) ; i >= (a.length / 2) ; i--){
            System.out.print(a[i] + " ");
        }
    }

    
}

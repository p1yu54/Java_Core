// Printing all odd elements from an array

public class Array8 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i : a){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}

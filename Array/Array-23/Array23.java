// Swapping first and last even indices of an array

public class Array23 {
    public static void printn(int a[]){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int a[] , int first , int last){
        int temp = a[first];
        a[first] = a[last];
        a[last] = temp;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        int size = a.length;
        int first = 0 , last = 0;
        System.out.println(size);
        for(int i = 0 ; i < size ; i++){
            if(i % 2 == 0){
                first = i;
                break;
            }
        }
        for(int i = size - 1 ; i >= 0 ; i--){
            if(i % 2 == 0){
                last = i;
                break;
            }
        }

        System.out.println("Before swapping :- ");
        printn(a);

        swap(a, first, last);

        System.out.println("After swapping :- ");
        printn(a);
    }
}

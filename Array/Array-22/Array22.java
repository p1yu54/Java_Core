// Swapping the first odd number and the last odd number in the array

public class Array22 {
    public static void printn(int arr[]){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int arr[] , int  first , int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6,7,8,9,10};
        
        int first = 0 , last = 0;

        for(int i = 0 ; i < a.length ; i++){
            if(a[i] % 3 == 0){
                first = i;
                break;
            }
        }
        for(int i = a.length - 1 ; i >= 0 ; i--){
            if(a[i] % 3 == 0 ){
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

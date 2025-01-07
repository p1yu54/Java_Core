// Altering the value in array

public class Array24 {
    public static void printn(String a[]){
        for(int i = 0 ; i < a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public static void swap(String a[] , int first , int last){
        String temp = a[first];
        a[first] = a[last];
        a[last] = temp;
    }
    public static void main(String[] args) {
        
        String a[] = {"hello" , "hii" , "bye" , "tata"};

        System.out.println("Before changing :- ");
        printn(a);
        
        swap(a,0,a.length - 1);

        System.out.println("After changeing :- ");
        printn(a);
    }
}

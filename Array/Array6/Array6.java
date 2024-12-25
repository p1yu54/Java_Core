// Finding the mid the element 

public class Array6 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i = 0 ; i < a.length ; i++){
            if(i == (a.length - 1) / 2){
                System.out.println("The mid element of array is = " + a[i]);
            }
        }
    }
}

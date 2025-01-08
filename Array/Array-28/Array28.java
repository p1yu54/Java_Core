// Finding common element in between two different array

public class Array28 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = {5,6,7,4,8};
        
        System.out.println("The common elements between array a and array b are :- ");
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < b.length ; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}

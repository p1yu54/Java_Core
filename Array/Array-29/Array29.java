// Counting the frequency of every element in an array

public class Array29{
    public static void main(String[] args) {
        int a[] = {1,2,3,2,1};

        int count = 0;

        for(int i = 0 ; i < a.length ; i++){
            count = 0;
            for(int j = 0 ; j <= 9 ; j++){
                if(a[i] == j){
                    count++;
                }
            }
            System.out.println("The frequnecy of " + a[i] + " is " + count);
        }
    }
}
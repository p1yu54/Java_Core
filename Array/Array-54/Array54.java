// Transpose of a matrix

    import java.util.*;

    public class Array54 {
        static Scanner sc = new Scanner(System.in);

        public static int[][] inputArray(){

            System.out.print("Enter the number of rows :- ");
            int rows = sc.nextInt();

            System.out.print("Enter the number of columns :- ");
            int cols = sc.nextInt();

            int a[][] = new int[rows][cols];

            for(int i = 0 ; i < rows ; i++){
                for(int j = 0 ; j < cols ; j++){
                    System.out.print("Enter the element at row " + (i+1) + " and column " + (j+1) + " :- ");
                    a[i][j] = sc.nextInt();
                }
            }

            return a;
        }

        public static void transpose(int a[][]){
            int ans[][] = new int[a.length][a[0].length];

            for(int i = 0 ; i < a.length ; i++){
                for(int j = 0 ; j < a[i].length ; j++){
                    ans[j][i] = a[i][j];
                }
            }

            printn(ans);
        }

        public static void printn(int a[][]){
            for(int i = 0 ; i < a.length ; i++){
                for(int j = 0 ; j < a[i].length ; j++){
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {

            int a[][] = inputArray();
            System.out.println("Before transpose :- ");
            printn(a);

            System.out.println("After transpose :-");
            transpose(a);
        }
    }

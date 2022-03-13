import java.util.*;

public class Examp {
    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and column of first and second 2-D array\n");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] sum = new int[m][n];
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        System.out.println("Enter the array elements of first 2-D array\n");
        for (i = 0; i < m; i++) {
    
                for (j =0; j < n; j++) {
                    arr1[i][j] = sc.nextInt();

                }
            }
        System.out.println("Enter the array elements of second 2-D array\n");
        for (i = 0; i < m; i++) {
            {
                for (j =0; j < n; j++) {
                    arr2[i][j] = sc.nextInt();

                }
            }
        }
       
            
                for (i = 0; i < m; i++) {
                    for (j = 0; j < n; j++){
                      

                            sum[i][j]= arr1[i][j] + arr2[i][j];
                     

                    
                }
            }
            System.out.println("Enter the array elements of second 2-D array\n");
        for (i = 0; i < m; i++) {
            {
                for (j =0; j < n; j++) {
                    System.out.print(sum[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
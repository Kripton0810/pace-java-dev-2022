import java.util.*;
public class DoubleDimention {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n =in.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        // int[][] c = new int[n][n];
        // System.out.println("Enter matrix A: ");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         a[i][j]= in.nextInt();
        //     }
        // }
        // System.out.println("Enter matrix B: ");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         b[i][j]= in.nextInt();
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         c[i][j]= a[i][j]+b[i][j];
        //     }
        // }
        
        // System.out.println("Sum of matrix A+B is: ");
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(c[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Enter matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= in.nextInt();
            }
        }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         b[i][j]= a[j][i];
        //     }
        // }
        
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n-1; j++) {
        //         for (int j2 = 0; j2 < n-j-1; j2++) {
        //             if (b[i][j2]>b[i][j2+1]) {
        //                 int temp = b[i][j2];
        //                 b[i][j2] = b[i][j2+1];
        //                 b[i][j2+1] = temp;
        //             }
        //         }
        //     }
        // }
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         a[i][j]= b[j][i];
        //     }
        // }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i==j)||(i+j==(n-1))) {
                    System.out.print(a[i][j]+" ");                    
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

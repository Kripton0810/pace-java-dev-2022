import java.util.*;

public class PalakArray {
    public static void main(String[] args) {
        int[][] arr = { { 4, 2, 9 }, { 2, 5, 8 }, { 9, 1, 1 } }; //array init
        for (int i = 0; i < 3; i++) {   //actuall array disp
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] trans = new int[3][3];
        for (int i = 0; i < 3; i++) { //transpose 
            for (int j = 0; j < 3; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        int temp = 0;
        //atual part
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - 1; j++) {
                for (int k = 0; k < 3 - j - 1; k++) {
                    if (trans[i][k] > trans[i][k + 1]) {
                        temp = trans[i][k];
                        trans[i][k] = trans[i][k + 1];
                        trans[i][k + 1] = temp;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) { //retrun to actual array
            for (int j = 0; j < 3; j++) {
                arr[i][j] = trans[j][i];
            }
        }
        for (int i = 0; i < 3; i++) { //disp 
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

import java.util.*;

public class loop {
    public static void main(String[] args) {
        //
        int i,j;
        i =9;
        while (i>=1) {
            j = 9;
            while (j>=i) {
                System.out.print(" "+j);
                j=j-2;
            }
            System.out.println();
            i=i-2;
        }
    }
}

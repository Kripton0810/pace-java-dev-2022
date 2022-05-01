import java.util.*;
public class AnuskaName {
    int a = 20;
    public static void main(String[] args) {
        //user said i need 5 element and one i will enter later
        int[]  arr = new int[6];
        Scanner in = new Scanner(System.in);
        for (int index = 0; index < 5; index++) {
            arr[index] = in.nextInt();
        }
        int pos, val;
        pos = 1;
        val = 50;
        // System.out.println(arr.length);
        for (int ix = arr.length-1 ; ix > pos; ix--) {
            arr[ix] = arr[ix-1];
        }
        //
        arr[pos] = val;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}

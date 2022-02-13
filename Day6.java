import java.util.*;

public class Day6 {
    public static void main(String[] args) {
        // int num = 6;
        // int c = 1;
        // while (num != 0) {
        // int d = num % 10;
        // System.out.println(d+"^"+c+"="+(int)Math.pow(d, c));
        // c++;
        // num /= 10;
        // }
        // digit count
        // int copy = num;
        // int sq =(int) Math.pow(copy, 2);
        // int n = 0;
        // while (num!=0) {
        // n++;
        // num/=10;
        // }
        // int last = sq%(int)Math.pow(10, n);
        // System.out.println(last);
        // if(last==copy)
        // {
        // System.out.println("yes");
        // }
        // else
        // {
        // System.out.println("no");
        // // }
        // int a = 1;
        // int b = 30;
        // // for (int i = 1; i <= 6; i++) {
        // for (int j = 1; j <= 6; j++) {
        // for (int k = 1; k <= 6; k++) {
        // System.out.print("(" + i + "," + j + "," + k + "), ");
        // }
        // System.out.println();
        // }
        // }
        // int i, j, k;
        // for (i = 1; i <= 6; i++) {
        // for (j = 1; j <= 6; j++) {
        // for (k = 1; k <= 6; k++) {
        // System.out.println("(" + i + "," + j + "," + k + ")");

        // }
        // }
        // }
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the range ");
        // a = in.nextInt();
        // b = in.nextInt();

        // int c = 1;
        // for (int i = a; i <= b; i++) {
        // c = 0;
        // for (int j = 1; j <= i; j++) {
        // if (i % j == 0) {
        // c++;
        // }
        // }
        // if (c == 2) {
        // System.out.println(i);
        // }

        // }

        int i = 1, c = 0, check = 0;
        while (true) {

            c = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.println(i);
                check++;

            }
            if (check == 30) {
                break;
            }

            i++;
        }

    }
}

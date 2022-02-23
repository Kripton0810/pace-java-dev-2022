import java.util.*;

public class loop {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        // int c = 1;
        // for (int j = 1; j <= (int)Math.sqrt(n); j++) {
        // if (n % j == 0) {
        // c++;
        // }
        // }
        // if (c == 2) {
        // System.out.println("It is a prime num");
        // } else {
        // System.out.println("It is not a prime num");
        // }
        // int copy = n;
        // int r = 0;
        // while (n != 0) {
        // int d = n % 10;
        // r = r * 10 + d;
        // n /= 10;
        // }
        // if (r == copy) {
        // System.out.println("Yes it is palindorm");
        // } else {
        // System.out.println("No it is not");
        // }
        // Armstrong
        // int copy = n;
        // int c = 0;
        // // digit count
        // while (n != 0) {
        // c++;
        // n /= 10;
        // }
        // n = copy;
        // int r = 0;
        // while (n != 0) {
        // int d = n % 10;
        // r = r + (int) Math.pow(d, c);
        // n /= 10;
        // }
        // n = copy;
        // if (r == n) {
        // System.out.println("Yes it is armstrong num");
        // } else {
        // System.out.println("No it is not");
        // }
        // long k = 0;
        // for (int i = 0; i < n; i++) {
        // // long ln = (long) ((Math.pow(10, i) - 1) / 9);
        // long ln = (long) Math.pow(10, i);
        // k = k + ln;
        // System.out.print(k + ", ");
        // }
        int copy = n;
        boolean ftob = true, btof = true;
        int temp = copy % 10;
        while (n != 0) {
            int d = n % 10;
            if (d > temp) {
                btof = false;
                break;
            }
            // System.out.println(d);
            temp = d;
            n /= 10;
        }
        n = copy;
        // // reverse
        // int rev = 0;
        // while (n != 0) {
        // int d = n % 10;
        // rev = rev * 10 + d;
        // // System.out.println(d);
        // n /= 10;
        // }
        temp = n % 10;
        while (n != 0) {
            int d = n % 10;
            if (d < temp) {
                ftob = false;
                break;
            }
            temp = d;
            n /= 10;
        }
        if (ftob || btof) {
            System.out.println("yes");
        } else {
            System.err.println("no");
        }
    }
}

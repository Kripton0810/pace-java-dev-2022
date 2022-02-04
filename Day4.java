public class Day4 {
    public static void main(String[] args) {
        int dis = 23;
        // a = 50;
        // if (a > 60) {
        // System.out.println("stage 1 pass");
        // } else if (a > 20) {
        // System.out.println("stage 2 pass");
        // } else if (a > 30) {
        // System.out.println("stage 3 pass");
        // } else if (a > 40) {
        // System.out.println("stage 4 pass");
        // } else if (a > 50) {
        // System.out.println("stage 5 pass");
        // }
        int price = 0;
        if (dis <= 5) {
            price = 100;
        } else if (dis <= 15) {
            price = 100 + (dis - 5) * 10;
        } else if (dis <= 25) {
            price = 100 + 100 + (dis - 15) * 8;
        } else {
            price = 100 + 100 + 80 + (dis - 25) * 5;
        }
        System.out.println(price);
    }
}

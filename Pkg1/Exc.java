package Pkg1;

public class Exc {
    public static void main(String[] args) {
        int a,b;
        b = 20;
        int[] arr  = new int[5];
        System.out.println("Hwlloe");
        // a = b/0;
        try {
            a = b/0;
            //kosis karege
            arr[10] = 200;
        } catch (Exception e) {
            //TODO: handle exception
            //bhai ni hua
            System.out.println(e.getMessage());
        }
        // System.out.println(a);
        System.out.println("world");
    }
}
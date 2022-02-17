import java.util.*;

public class Qno11and13 {
    int a = 10;
    final static int aim = 10;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(21);
        list.add(14);
        list.add(51);
        list.add(13);
        list.add(18);
        list.add(91);
        // for (Object object : list) {
        // System.out.println((int) object);
        // }
        // Collections.sort(list);

        // System.out.println("\n");
        // list.forEach(e -> {
        // System.out.println(e);
        // });
        TreeSet<Integer> list2 = new TreeSet<Integer>();

        list2.add(1);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        System.out.println(list2.tailSet(4));
    }

}
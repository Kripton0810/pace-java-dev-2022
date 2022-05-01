import java.util.*;
public class Abs
{
    public static void main(String[] args) {
        // for (char i = 'A'; i <= 'Z'; i++) {
        //     System.out.println(i+"\t\t\t\t"+Character.toLowerCase(i));
        // }
        int sum = 01+002;
        System.out.println(sum);
        for (char i = 'A'; i <= 'E'; i++) {
            for (char j = 'A'; j <=i; j++) {
                if (i%2==0) {
                 
                System.out.print(Character.toLowerCase(j));   
                }
                else
                {
                    
                System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

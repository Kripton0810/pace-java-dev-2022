import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double arr[] = new double[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10-1);
        }
        for (double d : arr) {
            System.out.print(d+", ");
        }
        System.out.println("After:");
        double temp=0;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for (double d : arr) {
            System.out.print(d+", ");
        }
        // subhankar:
        // for (int j = 1; j <= 3; j++) {
        //     for ( i = 0; i < arr.length; i++) {
        //         if (arr[i]>4) {
        //             continue;
        //         }
        //         else{
        //             System.out.println("Hello");
        //         }
        //         System.out.println(arr[i]);
        //     }
        //     System.out.println("After loop val of i is "+i);
        // }
        
        // int flag = 0;
        // int sch = in.nextInt();
        // for (double d : arr) {
        //     if (d==sch) {
        //         System.out.println("Yes i got!!!");
        //         flag=1;
        //         break;
        //     }
        // }
        // if (flag==0) {
        //     System.out.println("I can't find the number");
        // }
        // int c =0;
        // for (int i = 0; i < arr.length; i++) {
        //     c=1;
        //     for (int j = i+1; j < arr.length; j++) {
        //         if (arr[i]==arr[j]) {
        //             c++;
        //             arr[j]=Integer.MIN_VALUE;
        //         }
        //     }
        //     if (arr[i]!=Integer.MIN_VALUE) {
        //         System.out.println("The fq. of "+arr[i]+" is "+c);                
        //     }
        // }
        // double[] temp = new double[arr.length];
        // int k =0;
        // for (double d : arr) {
        //     if (d!=Integer.MIN_VALUE) {
        //         temp[k] = d;    
        //         k++;            
        //     }
        // }
        // for (double d : temp) {
        //     System.out.println(d);
        // }

        //[2,4,5,2,4,2]
        //     |,^,^,^
        //K!=
    }
}

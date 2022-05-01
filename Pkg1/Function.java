package Pkg1;

import java.util.*;

public class Function {
    public static void main(String[] args) {
        int arr[]  = {2,3,2,3,1,2};
        for (int i = 0; i < arr.length; i++) {
            int c = 1;
            if (arr[i]==Integer.MAX_VALUE) {
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    c++;
                    arr[j] = Integer.MAX_VALUE;
                }
            }
            System.out.println("The fq. of "+arr[i]+" is "+c);
        }
        
    }
}

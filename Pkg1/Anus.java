package Pkg1;

public class Anus {
    public static void main(String[] args) {
        int[] arr = {12,10,43,90,22,41,65,30,32,76};//unsorted array
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minpos])
                {
                    minpos = j;
                }
            }
                int tem = arr[minpos];
                    arr[minpos] = arr[i];
                    arr[i] = tem;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        
    }
}

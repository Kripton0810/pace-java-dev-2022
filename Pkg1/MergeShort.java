package Pkg1;

import java.util.*;

public class MergeShort {
    private static void conqure(int arr[],int low,int mid,int high) {
                int n1 = mid - low + 1;
                int n2 = high - mid;
                int[] L = new int[n1];
                int[] R = new int[n2];
                for (int i = 0; i < n1; i++) {
                    L[i] = arr[low+i];
                }
                for (int i = 0; i < n2; i++) {
                    R[i] = arr[mid+1+i];
                }
                int i=0,j=0,k=low;
                while (i<n1 && j<n2) {
                    if (L[i]<R[j]) {
                        arr[k++] = L[i++];
                    } else {
                        arr[k++] = R[j++];
                    }
                }
                while(i<n1)
                {
                    arr[k++] = L[i++];   
                }
                while(i<n1)
                {
                    arr[k++] = L[i++];   
                }
    }
    private static void divide(int arr[],int low,int high) {
        if(low>=high)
        {
            return;
        }
        else
        {
            int mid = low + (high - low)/2;
            divide(arr, low, mid);
            divide(arr, mid+1, high);
            conqure(arr, low, mid, high);
            
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,1,9,0,3,4};
        System.out.println(Arrays.toString(arr));
        divide(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}

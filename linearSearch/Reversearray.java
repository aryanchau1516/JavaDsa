

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("enter the element of the array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
            System.out.println(Arrays.toString(arr));
            Reversearray obj = new Reversearray();
            obj.reverse(arr);
            System.out.println(Arrays.toString(arr));     
    }
    void reverse(int[] arr)
    {
        int start = 0;
        int end= arr.length-1;
        while (start<end) {
            
        
        swap(arr,start,end);
        start++;
        end--;
    }
}
     void swap( int [] arr,int start,int end)
    {
        int temp=arr[start];
        arr[start]= arr[end];
        arr[end]=temp;
    }
    
}

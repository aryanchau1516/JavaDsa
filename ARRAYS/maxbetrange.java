package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class maxbetrange {   // findiag max betwwn the range 
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the value of array :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));  
        maxbetweenrange(arr,1,4);
    }
    static void  maxbetweenrange(int[] arr,int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++)
        {
            if (max<arr[i]) {
                max=arr[i];
            }
        }
        System.out.println("max no betwen the range is :"+max);
       
    }
    
}

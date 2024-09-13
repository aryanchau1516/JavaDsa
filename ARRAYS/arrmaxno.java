package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class arrmaxno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("enter the value of array :");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int max = -(Integer.MAX_VALUE);  // incase array is empty
      // second type   int max = arr[0];
        for(int i=0;i<5;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            
        }

        System.out.println("print the maximum value in this array:"+max);
       //System.out.println(max);
    }
    
}

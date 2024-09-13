package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class iunput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the value in the array :");
        for(int i=0 ;i<5;i++)
        {
              arr[i] = sc.nextInt();
        }
        System.out.println("printing the value of array :");
        // for(int i=0 ;i<arr.length;i++)
        // {
        //       System.out.println(arr[i]);
        // }
        System.out.println(Arrays.toString(arr));  // Arrays.ToString(arr) convert data in thids format =[2, 3, 7, 6,9]if we use this format we can print arr va;lue withou for loop
       // System.out.println(arr);
    }
    
}

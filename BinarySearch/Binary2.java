package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Binary2
 */
public class Binary2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        
        System.out.println("enter the element of the array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("entert the  elment to be search :");
        int search = sc .nextInt();
        Binary2 obj = new Binary2();
        System.out.print("the number is index no..: "+obj.BinarySearch(arr, search));
    }
        int BinarySearch(int [] arr,int search)
        {       
            int start=0;
            int end=arr.length-1;
            int mid;
            while (start<=end) {  // ascending order
             mid= start+(end-start)/2;
           
                 if (arr[mid]>search) {
                    end=mid-1;
                } 
                else if (arr[mid]<search) {
                    start=mid-1;
                } else {
                    return mid;  // for find mid element
                }
               
            }
            return -1;

          
        }
}
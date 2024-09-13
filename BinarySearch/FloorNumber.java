
package BinarySearch;

import java.util.Scanner;
/*
 * Floor number is use to print the search elemnt or the lessGreaterElement<=search
 * exp   [12 ,15,18, 20,25,26,30,56]
 * search= 37
 * floor number is = 30
 */
public class FloorNumber {
    int floornumberBinary(int arr[],int seach)
    {    int start=0;
        int end=arr.length-1;
        boolean asce = arr[start]<arr[end];
        while (start<=end) {
           int mid= start +(end- start)/2;
            if (arr[mid]== seach) {
                return mid;
            }
            if(asce)
            {
                if(arr[mid]>seach)
                {
                   end= mid-1;
                }
                else if (arr[mid]<seach) {
                    start=mid+1;
                }
            }
            else{
                if(arr[mid]<seach)
                {
                   end= mid-1;
                }
                else if (arr[mid]>seach) {
                    start=mid+1;
                }
            }
        }
        if(asce)
        {
            return end;
        }
        else{
            return start;
        }
    }
    public static void main(String[] args) {
        FloorNumber obj = new FloorNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the elemnt :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter rthe element :");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(("enter the elemnt to be seach:"));
        int search = sc.nextInt();
        int ans = obj.floornumberBinary(arr,search);
      System.out.println("the floor of the search elemnt is :"+arr[ans]);
    }
    
}

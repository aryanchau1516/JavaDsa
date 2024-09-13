package BinarySearch;

import java.util.Scanner;

/*
 * Ciel  number is use to print the search elemnt or the firstBigElement>=search
 * exp   [12 ,15,18, 20,25,26,30,56]
 * search= 37
 * floor number is = 56
 * 
 */

public class CielingNumber {
    int  cielingNumber(int arr[],int search){
        int start=0;
        int end= arr.length-1;
        int mid;
        boolean asc = arr[start]<arr[end];
        while (start<=end) {
            mid= start+(end-start)/2;
            if(arr[mid]==search)
           {  return mid;
           }
            if(asc)
            {
                if(arr[mid]<search){
                    start=mid+1;

                }
                else if(arr[mid]>search)
                {
                    end=mid-1;
                }
            }
            else{
                if(arr[mid]>search){
                    start=mid+1;

                }
                else if(arr[mid]<search)
                {
                    end=mid-1;
                }
            }
            
            
        }
      if(asc)
      {
        return start;
      }
      else{
        return end;
      }
    }
    public static void main(String[] args) {
        CielingNumber obj = new CielingNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the elemnent:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elemnet of the array:");
        for(int i=0;i<arr.length;i++)
    {
        arr[i]= sc.nextInt();
    }
    System.out.println("enter tjhe search value :");
    int search= sc.nextInt();
     int ans=(obj.cielingNumber(arr, search));
    
     if(ans==-1){
      for(int i=0;i<arr.length;i++)
      {
        if(search<arr[i])
        {
            System.out.println("the ceilin number is :"+arr[i]);
            break;
        }
    }
    }
    else{
    System.out.println("the ceiling nu8m,ber is:"+arr[ans]);
    }
    }
    
}

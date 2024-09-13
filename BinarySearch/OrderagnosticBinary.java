package BinarySearch;

import java.util.Scanner;

public class OrderagnosticBinary {
    int orderagnosticBinary(int arr[],int seach)
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
        return -1;
    }
    public static void main(String[] args) {
        OrderagnosticBinary obj = new OrderagnosticBinary();
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
        int ans = obj.orderagnosticBinary(arr,search);
        if(ans==-1){
            System.out.println("element is not present in the array");
        }
        else{
        System.out.println("the number is at index :"+ans);
        }
    }
    
}

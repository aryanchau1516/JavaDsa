package BinarySearch;

import java.util.Scanner;

public class Binary1 {
    public int binarySearch(int arr[],int search){
        int start=0;
        int end=arr.length-1;
       
        while(start<=end) {
            int mid= start +(end- start)/2;  //(star+end)/2 are same     
        
        if(arr[mid]>search)
        {            end= mid-1;
        }
        else if(arr[mid]<search)
        {
            start= mid+1;
        }
        else{
            return mid;
        }
    }
        return -1;
    }
    public static void main(String[] args) {
        Binary1 obj = new Binary1();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter tyhe number if the element:");
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("ente the nu8mber to be search :");
        int search = sc.nextInt();
        int ans=obj.binarySearch(arr,search);
        if(ans==-1){
            System.out.println("element is not present in the array");
        }
        else{
        System.out.println("the number is at index :"+ans);
        }
    }
    
}

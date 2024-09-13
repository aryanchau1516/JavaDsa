package sorting.cyclicSort;

import java.util.Arrays;
import java.util.Scanner;

public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the number of the elment :");
        n= sc.nextInt();

        int arr[]= new int[n];
       
        System.out.println("enter the array:");
        CyclicSort obj = new CyclicSort();
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
       obj.Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    void Sort(int[] arr)
    { int i=0;
        while ( i<arr.length) {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                swap(arr,i,correct);
            }
            else{
                i++;
            }
            
        }
    }
    void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
    
}


package sorting.cyclicSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelctionSort {
public static void main(String[] args) {
    int [] arr = {34,5,89,23,34,5,23};
    
   System.out.println(Arrays.toString(arr));
    SelctionSort obj = new SelctionSort();
    obj.Selctionsort(arr);
   // System.out.println(obj.compare(arr));
   System.out.println(Arrays.toString(arr));
} 
void Selctionsort(int [] arr)
{
    for(int i=0;i<arr.length;i++)
    {
    
    int end = arr.length-i-1;
    int MaxIndex = findmaxIndex(arr, 0, end);
        swap(arr,  MaxIndex,end);
     
}
}
void swap(int[] arr,int start,int end)
{
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
}
int findmaxIndex(int[] arr,int start,int end){
    int max=start;
   
    for(int i=start;i<=end;i++)
    {
        if(arr[max]<arr[i])
        {
                max=i;
        }
    }
    return max;
}
int compare(int[] arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]!=arr[i+1])
        {
            return i;
        }
    }
    return -1;
}
}

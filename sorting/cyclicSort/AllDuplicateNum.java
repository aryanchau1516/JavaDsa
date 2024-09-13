package sorting.cyclicSort;

import java.util.ArrayList;

public class AllDuplicateNum {
    public static void main(String[] args) {
        int[] arr =   {1,4,3,4,4,3,3};
        AllDuplicateNum obj = new AllDuplicateNum();
        System.out.println(obj.allDuplicateNum(arr));
    }
   public  ArrayList<Integer >allDuplicateNum(int[] arr)
    { int i=0;
       while (i<arr.length) {
        int correct = arr[i];
        if(arr[i]!=arr[correct])   // if length 4 and arr[i] is also 4 then its not swap
        {
            swap(arr,i,correct );
        }
        else {
            i++;
        }
       }
       ArrayList<Integer> ans = new ArrayList<>();
       for(int index=0;index<arr.length;index++)
       {
        if(arr[index]!=index+1)
        {
            ans.add(arr[index+1]);
           
        }
       }

       return ans;
    }
    void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

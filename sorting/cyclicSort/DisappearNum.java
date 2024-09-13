package sorting.cyclicSort;

import java.util.ArrayList;

/*
 * if(0,n) then correct = arr[i]
 * if(1,n) then correct = arr[i] -1;
 */
public class DisappearNum {
    public static void main(String[] args) {
        int[] arr={1,4,3,4,4,3,3};
    DisappearNum obj = new DisappearNum();
       // obj.missingNum(arr);
        System.out.println( obj.missingNum(arr));
      
    }
  public  ArrayList<Integer> missingNum(int[] arr)
    { int i=0;
       while (i<arr.length) {
        int correct = arr[i]-1;
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
            ans.add(index+1);
           
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

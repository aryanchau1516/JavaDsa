package sorting.cyclicSort;

import ARRALIST.inputarrlist;

/*
 * if(0,n) then correct = arr[i]
 * if(1,n) then correct = arr[i] -1;
 */
public class Missing {
    public static void main(String[] args) {
        int[] arr={1,2,0,3,};
        Missing obj = new Missing();
       // obj.missingNum(arr);
        System.out.println( obj.missingNum(arr));
    }
    int missingNum(int[] arr)
    { int i=0;
       while (i<arr.length) {
        int correct = arr[i];
        if(arr[i]<arr.length&&arr[i]!=arr[correct])   // if length 4 and arr[i] is also 4 then its not swap
        {
            swap(arr,i,correct );
        }
        else {
            i++;
        }
       }
       for(int index=0;index<arr.length;index++)    // if(1,n) then index=0 start, if(0,n) then index will start index=0
       {
        if(arr[index]!=index)
        {            return index;
        }
       }

       return arr.length;
    }
    void swap(int [] arr,int first,int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    
}

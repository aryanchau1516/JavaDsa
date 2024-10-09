//package BinarySearch;

import java.util.Arrays;

/*
 * arr[5,7,7,,7,7,14,30]  , traget = 7
 * Output = [1,4]
 * 
 * arr[5,7,7,8,8,10] , target = 6
 * outpu8t = [ -1,-1]
 */

public class FirstLastPos {
    int[] FirstLastPosarr(int[] arr,int target){
     int[] ans = {-1,-1};
     int start =  Search(arr, target,true);    
     int end =  Search(arr,target,false);    
    ans[0]= start;
     ans[1]= end;
     return ans;
    } 
      int Search(int[] arr, int target, boolean FisrtIndex) {
       int ans1 =-1;
        int start=0;
        int end=arr.length-1;
       
        while(start<=end) {
            int mid= start +(end- start)/2;  //(star+end)/2 are same     
        
        if(arr[mid]>target)
        {            end= mid-1;
        }
        else if(arr[mid]<target)
        {
            start= mid+1;
        }
        else{
            // potential answer found 
        ans1 = mid;
        if(FisrtIndex)
        {
            end = mid-1;
        }
        else{
            start = mid +1;
        }
        }
    }
        return ans1;
}
  
    public static void main(String[] args) {
        FirstLastPos obj = new FirstLastPos();
        int[] arr={5,7,7,7,7,14,30};
        int target = 7;
    //    int[] ans= obj.FirstLastPosarr(arr, target);
    //    System.out.println(ans.toString());
    System.out.println(Arrays.toString(obj.FirstLastPosarr(arr, target)));
    }
}

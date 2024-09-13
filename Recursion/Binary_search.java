package Recursion;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,45,67,88,99};
        int target = 67;

        Binary_search obj = new Binary_search();
        System.out.println(obj.search(arr, target,0,arr.length-1));

    }
    int search(int [] arr,int target,int s ,int e)
    {
        
        int mid;
        if(s>e)
        {
            return -1;
     
        }
        mid= s + (e-s)/2;
        if (arr[mid]==target) {
            return mid;
            
        }
        if (target>arr[mid]) {
            return search(arr, target,mid+1,e);
            
        }
        return search(arr, target, s, mid-1);
    }
}

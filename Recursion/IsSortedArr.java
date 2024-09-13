package Recursion;

public class IsSortedArr {
    // the question is check it is sorted array....
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        IsSortedArr obj = new IsSortedArr();
        System.out.println(obj.isSortedArr(arr, 0));
    }
    boolean isSortedArr(int[] arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return arr[index]<arr[index+1] && isSortedArr(arr, index+1);
    }
}

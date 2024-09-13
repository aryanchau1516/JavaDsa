package bitManipulation;

public class One {
    
    // the que is every number is appearing twice and one number is appearing once find that number
    // algo 1 . sort 2 .compare i and i+1 are equL
    public static void main(String[] args) {
        int [] arr = { 3,6,3,8,2,6,8,2,5};
        One obj = new One();
        obj.sort(arr);
        System.out.println(obj.compare(arr));

    }
        int[] sort(int[] arr)
        {
            int max = arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                if (arr[i]>max) {
                    swap(arr,0,arr.length-1);
                    
                }
            }
            return arr;
        }
        void swap(int[] arr,int start,int end)
{
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
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

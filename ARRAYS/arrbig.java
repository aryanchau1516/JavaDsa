package ARRAYS;
// first largest6 number in array
public class arrbig {
    public static void main(String[] args) {
        int arr[] = new int[] {8,-8,0,-5,7,10,-9};
       // int arr[] = new int[] {20,34,23,67,110,56,89};
        int big=-(Integer.MAX_VALUE);
       // int big2=-(Integer.MAX_VALUE);
        for(int i=0;i<arr.length;i++){
if(arr[i]>big)
{
   big=arr[i];
//    big2=big;
//    big=arr[i];
}
// else if(arr[i]>big2&&arr[i]<big)
// {
//     big2=arr[i];
// }}
// System.out.println("biggest element of the array :"+big);
 } System.out.println("first largest number is :"+big);

    }
    
}

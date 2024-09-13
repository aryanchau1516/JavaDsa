package Recursion;

public class LinearSerarrch {
    public static void main(String[] args) {
        LinearSerarrch obj = new LinearSerarrch();
        int [] arr = {1,2,3,4,5,6,7};
        int target= 1;
        System.out.println(obj.serarch(arr, target, 0));
    }
    boolean serarch(int [] arr,int target, int index)
    {
       if(index==arr.length)
       {
        return false;
       }
        return arr[index]==target || serarch(arr, target, index+1 );
       }
}


//
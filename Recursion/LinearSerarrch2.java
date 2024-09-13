package Recursion;

public class LinearSerarrch2 {
    public static void main(String[] args) {
        
   
    LinearSerarrch2 obj = new LinearSerarrch2();
    int [] arr = {1,2,3,4,5,6,7};
    int target= 3;
   System.out.println(obj.serarch(arr, target, 0));
}
int serarch(int [] arr,int target , int index)
{
    if(index==arr.length)
    {
        return-1;
    }
    if(arr[index]==target)
    {
        return index;
    }
    return serarch(arr, target, index+1);
}
}

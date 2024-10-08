//package Recursion;

import java.util.ArrayList;

public class LinearSerarrchAllOccur {
    public static void main(String[] args) {
        LinearSerarrchAllOccur obj = new LinearSerarrchAllOccur();
        int arr[] = {23,45,56,78,43,56,45,56};
        int target = 56;
       // using static arraylist

        //obj.findalloccur(arr, target, 0);
        //System.out.println(list);
        ArrayList<Integer> list = obj.findalloccur1(arr, target, target, new ArrayList<>());
       System.out.println(list);
    }
   
ArrayList<Integer> findalloccur1(int [] arr,int target , int index,ArrayList<Integer> list)
{
    if(index==arr.length)
    {
        return list;
    }
    if(arr[index]==target)
    {
       list.add(index);
    }
     return findalloccur1(arr, target, index+1,list);
}

}

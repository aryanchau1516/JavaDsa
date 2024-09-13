package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class swapindexval {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("enter the value in array :");
        for(int i=0;i<5;i++){
             arr[i] = sc.nextInt();
        }
        swap( arr,2,4);
        System.out.println(Arrays.toString(arr));  // Arrays.ToString(arr) convert data in thids format =[2, 3, 7, 6,9]
    }
     static void swap(int arr[],int index1,int index2){
        int temp=  arr[index1];
        arr[index1]= arr[index2];
        arr[index2]= temp;
        }
    
}

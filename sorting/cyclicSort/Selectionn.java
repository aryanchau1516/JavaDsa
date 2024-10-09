package sorting;

import java.util.Arrays;

public class Selectionn {
    public static void main(String[] args) {
        int arr[] = {-323,44,0,-21,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min = j;
                    }
            }
            // aftr find min then we swap it to the i position
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    
}

package sorting;

public class Bubble1 {
    public static void main(String[] args) {
       // int arr[] = {-45,32,-66,8,-2,0};
        int arr[] = {1,2,3,4,5};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); //-66 -45 -2 0 8 32 
        }
    }
    
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1]=temp;
            }
        }
        if (swap==0) { // when the array is already sorted then it condition return
            return;
        }
        }
    }
}

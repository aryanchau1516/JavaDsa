package GeekforGeeks;

public class Missingnum {
    


    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
    int t = arr.length;
     
        // Your Code Here
        for(int i=1;i<=t;i++){
            if(arr[i]!=i){
                return i;
            }
        }
         return -1;
    }
   
}
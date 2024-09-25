package ARRAYS;
public class second_bigarr {
    
        public static void main(String[] args) {
            int arr[] = new int[] {8,-8,0,-5,7,10,-9};
            if (arr.length < 2) {
            //throw new IllegalArgumentException("Array must have at least two elements.");
             return -1;
        }

        int big1 = Integer.MIN_VALUE;
        int big2 = Integer.MIN_VALUE;

        // Iterate over the array using a for loop
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > big1) {
                big2 = big1;  //  second the previous largest
                big1 = arr[i];  //  first  the new largest
            } else if (arr[i] > big2 && arr[i] != big1) {
                big2 = arr[i];  
            }
        }

        // If second is not updated, that means there is no second largest element
        if (big2 == Integer.MIN_VALUE) {
            return -1;
        }

        return big2;
    
        }
        
    }
    
    



package ARRAYS;

public class New {
   

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 2, 2, 1};
        int arr2[] = new int[6];
        New obj = new New();
        // Initialize an array to keep track of counted elements
        boolean counted[] = new boolean[arr.length];

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                int count = 0;
                
                // Count occurrences of the current element
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr2[i]=count;
                        counted[j] = true;  // Mark this element as counted
                    }
                }
                
                // Print the element and its count
               // System.out.println("Element " + arr[i] + " appears " + count + " times.");
                arr2[i]=count;
            }
        }
       
      System.out.println(obj.all(arr2));  
      
    }
    boolean all(int arr2[]){
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i]==arr2[i+1])
            {
                return false;
            }
           
        }
        return true;
    }
}


//public static void main(String[] args) {
  //  int arr[] = {1,2,4,2,2,1};
    //int[] arr2= new int[6];
    // 1 have 2
    // 2 have 3
    // 4 have 1
  //  accurance are diff
   // return true;
   // if accurance same
  //  return false  in java code 
package ARRAYS;
public class DuplicateEle {  
    public static void main(String[] args) {      
       
        int [] arr = new int [] {1, 2, 3, 4, 5, 6, 8, 7, 13};   
      
       System.out.println( dupli(arr));
    }
   static int dupli(int arr[])  {
    for(int i = 0; i < arr.length; i++) {  
        for(int j = i + 1; j < arr.length; j++) {  
            if(arr[i] == arr[j])  
               return arr[i]; 
             
        }  
    }  


        return -1 ;
    }
}  

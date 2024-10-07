package ARRAYS;

import java.util.HashSet;

public class DuplicateEle {  
    public static void main(String[] args) {      
       
        int [] arr = new int [] {1, 2, 3, 2, 5, 6, 8, 5,6,13};   
      
       System.out.println( duplicate(arr));
    }
   static HashSet<Integer> duplicate(int arr[]){
        HashSet<Integer> st = new HashSet<>();
        HashSet<Integer> gt = new HashSet<>();
        for (Integer num :arr) {
            
        
        if(!st.add(num)){
            gt.add(num);
        }
        }
        return gt;
   }
}  

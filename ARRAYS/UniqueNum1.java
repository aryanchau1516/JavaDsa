package ARRAYS;

public class UniqueNum1 {
   

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 2, 2, 1};
        int arr2[] = new int[arr.length];
        UniqueNum1 obj = new UniqueNum1();
       
        boolean countedEle[] = new boolean[arr.length];
 for (int i = 0; i < arr.length; i++) {
            if (!countedEle[i]) {
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr2[i]=count;
                        countedEle[j] = true;  
                    }
                }
                System.out.println(count);  
                arr2[i]=count;
            }
        }
       
      System.out.println(obj.all(arr2));  
      
    }


    boolean all(int arr2[]){
        for(int i=0;i<arr2.length-1;i++)
        {
           // for(int j =0 ; i<arr2.length-1;j++)
         //   {
                if(arr2[i]!=arr2[i+1])
                {
                    return true;
                }
          //  }
           
           
        }
        return false;
    }
}



package linearSearch;

import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
       
         Scanner sc = new Scanner(System.in);
        int[] arr=new int[0];
        System.out.println("enter the value of array :");
        // for(int i=0;i<5;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // MinValue obj = new MinValue();
        // System.out.println(obj.min(arr));;

    }
    int min(int [] arr)
    { if(arr.length==0)
        {
            return 0;
        }
        int ans = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(ans>arr[i])
            {
                ans=arr[i];
            }
           
        }
        return ans;
        
    }
    
}

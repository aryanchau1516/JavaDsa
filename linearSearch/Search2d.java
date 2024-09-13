import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Search2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int [] [] arr =  new int[3][2] ;
for(int r = 0;r<arr.length;r++)
{
    for(int c =0;c<arr[r].length;c++)
    {
        arr[r][c]=sc.nextInt();   }
}

// most important 
//..............................................
// for(int[] a : arr)
// {
//     System.out.println(Arrays.toString(a));
// }

// //or 
// for(int r = 0;r<arr.length;r++)
// {
//     for(int c =0;c<arr[r].length;c++)
//     {
//         System.out.println(arr[r][c] + " ");  
//      }
//         System.out.println();
//}

for(int r=0;r<arr.length;r++)
{
    System.out.println(Arrays.toString(arr[r]));
}


    }
}

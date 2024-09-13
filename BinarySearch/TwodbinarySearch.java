package BinarySearch;
/*
 * searching in atwo d array.......
 * time complexity 2n
 */
import java.util.Arrays;

/**
 * 2dbinarySearch
 */
public class TwodbinarySearch {
           int[]  search(int[][] matrrix ,int target)
            {
                int r=0;
                int c = matrrix.length-1;
                while (r<matrrix.length&&c>=0) {
                    if(matrrix[r][c]==target)
                    {
                    return new int[]{r,c};
                    }
                    if(matrrix[r][c]<target)
                    {
                        r++;
                    }
                    else{
                        c--;
                    }

                    
                }

                return  new int[]{-1,-1};
            }
    public static void main(String[] args) {
        TwodbinarySearch obj = new TwodbinarySearch();
    int[][] arr    = {{10,20,30,40},
{15,25,35,45},{28,30,32,34},{
    33,34,38,50
}};
System.out.println(Arrays.toString(obj.search(arr,33)));
    }

     
}
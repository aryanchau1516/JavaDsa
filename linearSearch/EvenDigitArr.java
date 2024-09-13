


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * EvenDigitArr
 */
public class EvenDigitArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        EvenDigitArr obj = new EvenDigitArr();
        System.out.println("even number of digit in this array :"+obj.evenDigit(arr));
    }
    int evenDigit(int[] arr)
    {
        int count=0;
        for(int num : arr)
        {
            if(even(num))
            {
                count++;
            }
        }
        return count;
    }
    boolean even(int arr)
    {   int numofdigit= digit(arr);
        // if(numofdigit%2==0)
        // {
        //     return true;
        // }

        // return false;
        return numofdigit %2 ==0;
    }
    int digit(int num)
    { int count=0; 
        while (num>0) {
            count++;
            num=num/10;
        }
        return count;
    }
}

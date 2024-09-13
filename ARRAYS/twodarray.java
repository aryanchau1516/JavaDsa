package ARRAYS;
import java.util.Scanner;

/**
 * twodarray
 */
public class twodarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("enter the size of array:"+n);
        // int n = sc.nextInt();

        System.out.println("enter the value of array:");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
            // System.out.println(arr[i]);
        }
        for(int i=0;i<n;i++){
            // arr[i]= sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
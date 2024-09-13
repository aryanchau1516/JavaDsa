import java.lang.reflect.Array;
import java.util.Arrays;

public class bsort {  // bubble sort
    public static void main(String[] args) {
        // int [] arr={23,6578,6576,8979,4,36,-765,5,-56};
        int arr[] = { 1, 2, 3, 4, 575, -675, 455, 6, 996, -3543 };
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int arr[]) {
        int i, j, temp;

        for (i = 0; i < arr.length; i++)

            for (j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) { // j=12 i=j-1=7    j=12 j-i=17
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

    }
}

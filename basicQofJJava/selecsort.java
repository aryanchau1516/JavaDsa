import java.util.Arrays;

public class selecsort {
    public static void main(String[] args) {
        int ar[] = { 3423, 32534 - 45345, -455345, 534, -534, 4, -5 };
        selection(ar);
        System.out.println(Arrays.toString(ar));
        
    }

    static void selection(int ar[]) {
        for (int i = 0; i < ar.length; i++) {
            int last = ar.length - i - 1;
            int maxindex = getmaxIndex(ar, 0, last);
            swap(ar, maxindex, last);
        }
    }

    static int getmaxIndex(int ar[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (ar[max] < ar[i]) {
                max = i;
            }

        }
        return max;
    }

    static void swap(int ar[], int first, int second) {
        int temp = ar[first];
        ar[first] = ar[second];
        ar[second] = temp;
    }

}

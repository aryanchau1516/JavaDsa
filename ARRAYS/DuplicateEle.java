import java.util.HashSet;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        // Use two HashSets
        HashSet<Integer> uniqueSet = new HashSet<>();  // To track unique elements
        HashSet<Integer> duplicateSet = new HashSet<>();  // To track duplicates

        // Process the array
        for (int num : arr) {
            if (!uniqueSet.add(num)) {
                // If element is already in uniqueSet, it's a duplicate
                duplicateSet.add(num);
            }
        }

        // Remove all duplicates from uniqueSet
        uniqueSet.removeAll(duplicateSet);

        // Convert uniqueSet back to array
        int[] result = new int[uniqueSet.size()];
        int i = 0;
        for (int num : uniqueSet) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 1, 5};
        int[] uniqueArr = removeDuplicates(arr);
        
        // Print the result (only elements that appear once)
        for (int num : uniqueArr) {
            System.out.print(num + " ");
        }
    }
}

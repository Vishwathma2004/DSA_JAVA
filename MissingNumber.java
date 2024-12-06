//https://leetcode.com/problems/missing-number/description/
//find the missing number
public class MissingNumber {
    public int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            // Ensure that arr[i] is within bounds and it's not already in its correct position
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct); // Swap elements to their correct positions
            } else {
                i++; // If no swap is needed, move to the next element
            }
        }
        
        // Now, search for the first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index; // The first missing number is at index
            }
        }
        
        // If no missing number found, it means the array contains numbers 0 to n-1, so return n
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}


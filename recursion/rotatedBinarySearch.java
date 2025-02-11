import java.util.Scanner;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input: number of elements in the array
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Input: elements of the array
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Input: target element to search
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        
        // Calling the rotated binary search function
        int result = rotatedBinarySearch(arr, target, 0, arr.length - 1);
        
        // Output result: index of target or -1 if not found
        if (result == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + result);
        }
    }

    // Function to perform rotated binary search
    static int rotatedBinarySearch(int[] arr, int target, int start, int end) {
        // Base case: target not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        // Check if the middle element is the target
        if (arr[mid] == target) {
            return mid;
        }

        // Check if the left portion is sorted
        if (arr[start] <= arr[mid]) {
            // If the target is in the left sorted portion, search in the left subarray
            if (target >= arr[start] && target <= arr[mid]) {
                return rotatedBinarySearch(arr, target, start, mid - 1);
            } else {
                // Otherwise, search in the right subarray
                return rotatedBinarySearch(arr, target, mid + 1, end);
            }
        }

        // If the right portion is sorted
        if (arr[mid] <= arr[end]) {
            // If the target is in the right sorted portion, search in the right subarray
            if (target >= arr[mid] && target <= arr[end]) {
                return rotatedBinarySearch(arr, target, mid + 1, end);
            } else {
                // Otherwise, search in the left subarray
                return rotatedBinarySearch(arr, target, start, mid - 1);
            }
        }

        // If we reach here, the array is not sorted (this case shouldn't happen with a valid rotated sorted array)
        return -1;
    }
}

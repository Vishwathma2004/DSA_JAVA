import java.util.Arrays;
import java.util.Scanner;

public class TrianglePatternUsingRecursion {
    public static void main(String[] args) {
        // Printing triangle patterns using recursion
        triangle(4, 0); // This prints a right-angled triangle
        System.out.println();
        triangle2(4, 0); // This prints a reverse right-angled triangle
        
        // Sorting an array using bubble sort with recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        bubble(arr, arr.length); // Calling bubble sort
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Printing sorted array
    }

    // Method to print a triangle pattern
    static void triangle(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("* ");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }

    // Method to print a reverse triangle pattern
    static void triangle2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("* ");
        } else {
            triangle2(r - 1, 0);
            System.out.println();
        }
    }

    // Recursive bubble sort method
    static void bubble(int[] arr, int r) {
        if (r == 1) { // If only one element remains, the array is sorted
            return;
        }
        
        // Bubble up the largest element to the end of the current range
        for (int c = 0; c < r - 1; c++) {
            if (arr[c] > arr[c + 1]) {
                // Swap elements
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
        }
        
        // Call the bubble sort for the remaining part of the array
        bubble(arr, r - 1); // After each pass, reduce the range of elements
    }
}

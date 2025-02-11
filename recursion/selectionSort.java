import java.util.Arrays;
import java.util.Scanner;
public class selectionSort {
    public static void main(String[] args) {
        // Sorting an array using bubble sort with recursion
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        selection(arr, arr.length,0,0); // Calling bubble sort
        System.out.println("Sorted array: " + Arrays.toString(arr)); // Printing sorted array
    }
    static void selection(int[] arr,int r,int c,int max){
            if(r==0){
                return;
            }
            if(c<r){
                if(arr[c]>arr[max]){
                    selection(arr, r, c+1, c);

                }
                else{
                    selection(arr, r, c+1, max);
                }
            }
            else{
                int temp = arr[max];
                arr[max] = arr[r-1];
                arr[r-1] = temp;
                selection(arr, r-1, 0, 0);
            }
    }
}

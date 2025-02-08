import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr;
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the element");
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the taget");
        int target = sc.nextInt();
        System.out.println("Element found at index:");
        System.out.print(search(arr, target, 0, n-1));

    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = (start)+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr, target, start, mid-1);
        }
        else{
            return search(arr, target, mid+1, end);
        }
    }
}

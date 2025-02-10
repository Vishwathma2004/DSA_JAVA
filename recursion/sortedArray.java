import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in array");
        int n=sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean result = sorted(arr, 0);
        if(result){
            System.out.println("Array sorted");
        }
        else{
            System.out.println("Array not sorted");
        }
        
    }
    static boolean sorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&& sorted(arr, index+1);
    }
}

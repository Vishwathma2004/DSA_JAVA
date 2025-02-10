import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int index  = find(arr, target, 0);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            index+=1;
            System.out.println("Element found at index :"+index);
        }
    }
    static int find(int[] arr,int target,int index){
        if(index>=arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return find(arr,target,index+1);
    }
}

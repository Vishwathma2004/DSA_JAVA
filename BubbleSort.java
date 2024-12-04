public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,8,3,1,2};
        bubble(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    } 
    static void bubble(int arr[]){
        //run the steps in n-1 times
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                //swap if the item smaller than the previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped ) {
                break;
            }
        }
    }
}

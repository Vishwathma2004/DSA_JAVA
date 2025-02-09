public class ascendingOrder{
    public static void main(String[] args) {
        ascending(5);
    }
    static void ascending(int n){
        if(n==0){
            return;
        }
        ascending(n-1);
        System.out.println(n);
    }
}
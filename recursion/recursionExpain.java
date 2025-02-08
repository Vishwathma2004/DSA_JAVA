public class recursionExpain {
    public static void main(String args[]){
        print(1);
    }
    static void print(int n){
        //basse condition
        if(n==5){
            System.out.println(5);
            return;
        }
        System.out.println(n);

        //recursive call 
        //if u are a calling function again and again ,you can treat it 
        print(n+1);
    }
}

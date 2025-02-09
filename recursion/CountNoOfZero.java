import java.util.Scanner;

public class CountNoOfZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("No. of Zeros is:");
        System.out.println(Zeros(n));
    }
    static int count=0;
    static int Zeros(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        if(rem==0){
            count++;
            Zeros(n/10);
        }
        else{
            Zeros(n/10);
        }
        return count;
    }
}

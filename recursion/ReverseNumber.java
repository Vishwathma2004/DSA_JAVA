import java.util.Scanner;
public class ReverseNumber {
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum = sum*10+rem;
        reverse(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n=sc.nextInt();
        System.out.println("The number reversed is:");
        reverse(n);
        System.out.println(sum);
    }
    
}

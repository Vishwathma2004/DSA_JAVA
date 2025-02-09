import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        if(n==reverse(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    static int reverse(int n){
        return reverseHelper(n,0);
    }
    static int reverseHelper(int n,int sum){
        if(n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10+rem;
        return reverseHelper(n/10,sum);
    }
}
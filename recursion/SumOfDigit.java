import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Sum of Digit is:");
        System.out.println(sumOfDigit(n));
    }
    static int sumOfDigit(int n){
        if(n==0){
            return 0;
        }
        return sumOfDigit(n/10)+n%10;
    }
}

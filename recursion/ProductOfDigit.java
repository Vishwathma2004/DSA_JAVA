import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println("Product of digits is:");
        System.out.println(product(n));
        
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return product(n/10)*(n%10);
    }
}

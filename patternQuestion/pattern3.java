package patternQuestion;

public class pattern3 {
    public static void main(String[] args) {
        pattern33(5);
    }     
    static void pattern33(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

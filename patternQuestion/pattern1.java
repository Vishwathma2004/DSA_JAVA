package patternQuestion;
public class pattern1{
    public static void main(String args[]){
       pattern11(4);
    }
    static void pattern11(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
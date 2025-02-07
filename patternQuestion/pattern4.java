package patternQuestion;

public class pattern4 {
    public static void main(String[] args) {
        pattern44(5);
    }
    static void pattern44(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}

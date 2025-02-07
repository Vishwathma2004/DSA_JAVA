package patternQuestion;

public class pattern5 {
    public static void main(String[] args) {
        pattern55(5);
    }
    static void pattern55(int n){
        for(int row=0;row<2*n;row++){
            int totalColInRows = row>n?2*n-row:row;
            int totalNoOfSpaces = n-totalColInRows;
            for(int s=0;s<totalNoOfSpaces;s++){
                System.out.print(" ");
            }
            for(int col=0;col<totalColInRows;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

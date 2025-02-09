public class FibUsingGoldenRatio {
    public static void main(String[] args) {
        // Loop through the first 11 Fibonacci numbers
        // for (int i = 0; i < 11; i++) {
        //     System.out.println(fibFormula(i)); // Pass the index i as the parameter
        // }
        // System.out.println(fibFormula(50));
        System.out.println(fibFormula(70));
    }

    static int fibFormula(int n) {
        // Using the Golden Ratio (Binet's formula)
        return (int)Math.round((Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5))); 
    }
}

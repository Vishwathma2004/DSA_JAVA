import java.util.ArrayList;

public class subseqArr {
    public static void main(String[] args) {
        ArrayList<String> result = subseqArrr("", "abc");
        System.out.println(result);  // Prints all subsequences
    }

    static ArrayList<String> subseqArrr(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        ArrayList<String> left = subseqArrr(p + ch, up.substring(1));  // Include current character
        ArrayList<String> right = subseqArrr(p, up.substring(1));      // Exclude current character
        
        left.addAll(right);  // Combine both lists
        return left;
    }
}

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = subset(arr);
        System.out.println(result);
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> inner = new ArrayList<>(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
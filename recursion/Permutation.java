import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        permutation("", "abc");
        ArrayList<String> ans = permu("", "abc");
        System.out.println(ans);
    }   
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }
    static ArrayList<String> permu(String up,String p){
        ArrayList<String>list = new ArrayList<>();
        if(up.isEmpty()){
            System.out.println(p);
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f = p.substring(0, i);
            String l = p.substring(i, p.length());
            ans.addAll(permu(f+ch+l, up.substring(i)));
        }
        return ans;
    }
}

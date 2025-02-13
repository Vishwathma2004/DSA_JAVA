import java.util.ArrayList;
import java.util.Scanner;

public class LetterCombination{
    public static void main(String[] args) {
        // Scanner sc=new Scanner (System.in);
        // System.out.println("Enter the digit");
        // int n=sc.nextInt();
        // System.out.println("No of combination is:");
        // phonepad("", n);
        System.out.println(phonepad("", "12"));
        System.out.println(padCount("", "12"));
    }
    static ArrayList<String> phonepad(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0)-'0';//this will convert '2' to 2
        ArrayList<String> list = new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            list.addAll(phonepad(p+ch, up.substring(1)));
        }
        return list;
    }
    static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0)-'0';
        int count = 0;
        
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch = (char)('a'+i);
            count = count + padCount(p+ch, up.substring(1));            
        }
        return count;
    }
}
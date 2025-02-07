import java.util.Arrays;
public class Methods {
    public static void main(String args[]){
        String name = "Koushik Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('K'));
        System.out.println("   Koushik    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}

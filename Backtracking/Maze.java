import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);
        System.out.println(pathRet("", 3, 3));
    }

    // Counts the number of paths in the maze
    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);  // Move down
        int right = count(r, c - 1); // Move left
        return left + right;
    }

    // Prints all paths in the maze
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) { // Move down
            path(p + 'D', r - 1, c);
        }
        if (c > 1) { // Move left
            path(p + 'L', r, c - 1);
        }
    }

    // Returns a list of all paths in the maze
    static ArrayList<String> pathRet(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (r > 1) { // Move down
            list.addAll(pathRet(p + 'D', r - 1, c));
        }
        if (c > 1) { // Move left
            list.addAll(pathRet(p + 'L', r, c - 1));
        }
        return list;
    }
}

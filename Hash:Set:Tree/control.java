import java.util.*;
import java.io.*;
public class control {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int recipes = Integer.parseInt(br.readLine());
        int concocted = 0;

        List<SortedSet<Character>> con = new ArrayList<SortedSet<Character>>();

        for (int x = 0; x < recipes; ++x) {
            String str = br.readLine().replace(" ", "").substring(1);
            SortedSet<Character> newIngr = new TreeSet<>();
            for (char c : str.toCharArray()) {
                newIngr.add(c);
            }

            boolean intersect = false;
            List<SortedSet<Character>> l = new ArrayList<SortedSet<Character>>(); //removal list

            for (SortedSet<Character> tmp : con) { //it through list of concoctions
                // intersect = tmp.size() >= newIngr.size() ? !Collections.disjoint(tmp, newIngr) : !newIngr.containsAll(tmp);
                // if (intersect) break;
                // if (tmp.size() < newIngr.size()) { l.add(tmp); }
                if (!Collections.disjoint(tmp, newIngr) && !newIngr.containsAll(tmp)) {
                    intersect = true;
                    break;
                } 
                if (tmp.size() < newIngr.size()) { l.add(tmp); }
            }

            if (!intersect) {
                concocted++;
                con.removeAll(l);
                con.add(newIngr);
            }
        }
        pw.println(concocted);
        pw.flush();
    }
}
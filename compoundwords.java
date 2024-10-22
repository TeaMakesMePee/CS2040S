import java.util.*;
import java.io.*;
public class compoundwords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        List<String> l = new ArrayList<>();
        String words = br.readLine();
        while (words != null) {
            for (String s : words.split(" ")) l.add(s);
            words = br.readLine();
        }

        SortedSet<String> s = new TreeSet<>();
        for (int x = 0; x < l.size(); ++x) {
            for (int y = 0; y < l.size(); ++y) {
                if (y == x) continue;
                s.add(l.get(x) + l.get(y));
            }
        }

        for (String str : s) pw.println(str);
        pw.flush();
    }
}
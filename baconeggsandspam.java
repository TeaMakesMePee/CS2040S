import java.util.*;
import java.io.*;
public class baconeggsandspam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        HashMap<String, List<String>> map = new HashMap<>();
        int loop = Integer.parseInt(br.readLine());
        while (loop > 0) {
            for (int x = 0; x < loop; ++x) {
                String[] line = br.readLine().split(" ");
                for (int y = 1; y < line.length; ++y) {
                    List<String> tmp = map.get(line[y]);
                    if (tmp != null) {
                        tmp.add(line[0]);
                    } else {
                        List<String> tmp2 = new ArrayList<String>();
                        tmp2.add(line[0]);
                        map.put(line[y], tmp2);
                    }
                }
            }
            SortedSet<String> temp = new TreeSet();
            for (String d : map.keySet()) { temp.add(d); }
            for (String s : temp) {
                pw.print(s + " ");
                List<String> temp2 = map.get(s);
                Collections.sort(temp2);
                for (int x = 0; x < temp2.size(); ++x) {
                    pw.print(temp2.get(x));
                    if (x != temp2.size() - 1) { pw.print(" "); }
                }
                pw.println();
            }
            map.clear();
            loop = Integer.parseInt(br.readLine());
            if (loop > 0) pw.println();
        }
        pw.flush();
    }
}

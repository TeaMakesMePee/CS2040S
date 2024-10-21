import java.util.*;
import java.io.*;
public class sortofsorting2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int loop = Integer.parseInt(br.readLine());
        List<String> l = new ArrayList<String>();
        do {
            for (int x = 0; x < loop; ++x) {
                l.add(br.readLine());
            }
            Collections.sort(l, (x, y) -> x.substring(0, 2).compareTo(y.substring(0, 2)));
            for (String s : l) {
                pw.println(s);
            }
            l.clear();
            loop = Integer.parseInt(br.readLine());
            if (loop > 0) pw.println();
        } while (loop != 0);
        pw.flush();
    }
}

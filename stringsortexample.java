import java.util.*;
import java.io.*;
public class stringsortexample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String[] lines = br.readLine().split(" ");
        while (!(lines[0].equals("0") && lines[1].equals("0"))) {
            int loop = Integer.parseInt(lines[0]);
            int size = Integer.parseInt(lines[1]);
            String[] arr = new String[size];
            for (int x = 0; x < loop; ++x) {
                String[] l = br.readLine().split("");
                for (int y = 0; y < size; ++y) {
                    if (arr[y] == null) arr[y] = l[y];
                    else arr[y] += l[y];
                }
            }
            Arrays.sort(arr, (a, b) -> a.toLowerCase().compareTo(b.toLowerCase()));
            for (int x = 0; x < loop; ++x) {
                for (int y = 0; y < size; ++y) {
                    pw.print(arr[y].charAt(x));
                }
                pw.println();
            }
            lines = br.readLine().split(" ");
            if (!(lines[0].equals("0") && lines[1].equals("0"))) pw.println();
        }
        pw.flush();
    }
}
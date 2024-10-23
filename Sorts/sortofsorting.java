import java.io.*;
import java.util.*;
public class sortofsorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int x = Integer.parseInt(br.readLine());
        while (x != 0) {
            String[] arr = new String[x];
            for (int y = 0; y < x; ++y) {
                arr[y] = br.readLine();
            }
            Arrays.sort(arr, (a, b) -> {
                return a.substring(0, 2).compareTo(b.substring(0, 2));
            });
            for (int y = 0; y < x; ++y) {
                pw.append(arr[y] + "\n");
            }
            x = Integer.parseInt(br.readLine());
            if (x != 0) { pw.append("\n"); }
        }
        pw.flush();
    }
}

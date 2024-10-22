import java.util.*;
import java.io.*;
public class whatdoesthefoxsay {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int cases = Integer.parseInt(br.readLine());
        for (int x = 0; x < cases; ++x) {
            List<String> l = new ArrayList<>(Arrays.asList(br.readLine().split(" ")));

            String line = br.readLine();
            while (!line.equals("what does the fox say?")) {
                String[] arr = line.split(" ");
                l.removeIf(str -> str.equals(arr[arr.length - 1]));
                line = br.readLine();
            }
            for (int y = 0; y < l.size(); ++y) {
                pw.print(l.get(y));
                if (y != l.size() - 1) pw.print(" ");
            }
            pw.println();
        }
        pw.flush();
    }
}

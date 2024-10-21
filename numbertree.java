import java.util.*;
import java.io.*;
public class numbertree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int nodes = (int) Math.pow(2.0, Double.parseDouble(line[0]) + 1.0) - 1;

        int currIndex = 0;
        if (line.length > 1) {
            for (int x = 0; x < line[1].length(); ++x) {
                currIndex = currIndex * 2 + (line[1].charAt(x) == 'L' ? 1 : 2);
            }
        }
        pw.println(nodes - currIndex);
        pw.flush();
    }
}
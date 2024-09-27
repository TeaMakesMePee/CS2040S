import java.util.*;
import java.io.*;

public class rankproblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        List<String> arr = new ArrayList<>();
        int teams = Integer.parseInt(line[0]);
        int matches = Integer.parseInt(line[1]);

        for (int i = 1; i < teams + 1; i++) { arr.add("T" + i); }

        for (int j = 0; j < matches; ++j) {
            String[] match = br.readLine().split(" ");
            int aInd = arr.indexOf(match[0]);
            int bInd = arr.indexOf(match[1]);

            if (aInd > bInd) {
                for (int x = bInd + 1; x < aInd + 1; x++) { arr.set(x - 1, arr.get(x)); }
                arr.set(aInd, match[1]);
            }
        }

        for (int x = 0; x < arr.size(); x++) { pw.append(arr.get(x)); if (x != arr.size() - 1) { pw.append(" "); } }
        pw.flush();
    }
}
import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class TreeMapEntrySetExample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
    
        TreeMap<Integer, String> players = new TreeMap();
        int playerCount = Integer.parseInt(br.readLine());
    
        for (int x = 0; x < playerCount; x++) {
            String[] inp = br.readLine().split(" ");
            players.put(Integer.parseInt(inp[1]), inp[0]);
        }

        int ideaCount = Integer.parseInt(br.readLine());
        Entry<Integer, String> p = null;
        for (int x = 0; x < ideaCount; ++x) {
            p = players.floorEntry(Integer.parseInt(br.readLine()));
            pw.println(p != null ? p.getValue() : ":(");
        }
        pw.flush();
    }
}
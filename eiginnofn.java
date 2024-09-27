import java.io.*;
import java.util.*;
public class eiginnofn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int noRes = Integer.parseInt(br.readLine());
        Hashtable<String, String> residents = new Hashtable<String, String>();
        for (int i = 0; i < noRes; i++) {
            String[] line = br.readLine().split(" ");
            if (line.length > 1) { residents.put(line[0], line[0] + " " + line[1]); } 
            else { residents.put(line[0], line[0]); }
        }

        int noReq = Integer.parseInt(br.readLine());
        for (int i = 0; i < noReq; i++) {
            String key = br.readLine();
            String val = residents.getOrDefault(key, "");
            if (val == "") { pw.println("Neibb");}
            else {
                if (val.split(" ").length > 1) {
                    pw.println("Neibb en " + val + " er heima");
                } else { 
                    pw.println("Jebb"); 
                }
            }
        }
        pw.flush();
    }
}
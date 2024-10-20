import java.util.*;
import java.io.*;
public class sim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int cases = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Boolean front = false;
        int cursor = -1;
        for (int x = 0; x < cases; ++x) {
            for (char c : br.readLine().toCharArray()) {
                if (c == '<') { 
                    if (!sb.isEmpty()) {
                        sb.deleteCharAt(cursor); 
                        cursor--; 
                    }
                } else if (c == '[') { 
                    front = true; cursor = -1; 
                } else if (c == ']') { 
                    front = false; cursor = sb.length() - 1; 
                } else {
                    if (front) { cursor++; sb.insert(cursor, c); }
                    else { sb.append(c); cursor++;}
                }
            }
        }
        pw.println(sb.toString());
        pw.flush();
    }
}

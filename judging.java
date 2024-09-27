import java.io.*;
import java.util.*;
public class judging {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int size = Integer.parseInt(br.readLine());
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < size; i++) {
            String line = br.readLine();
            if (line.equals("correct")) { x++; } 
            else if (line.equals("wronganswer")) { y++; } 
            else { z++; }
        }
        for (int i = 0; i < size; i++) {
            String line = br.readLine();
            if (line.equals("correct")) { if (x > 0) x--; } 
            else if (line.equals("wronganswer")) { if (y > 0) y--; } 
            else { if (z > 0) z--; }
        }
        pw.println(5 - x - y - z);
        pw.flush();
    }
}
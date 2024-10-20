import java.io.*;
import java.util.*;

public class cd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        HashSet<Long> ht = new HashSet<>();
        HashSet<Long> ht2 = new HashSet<>();
        String[] lines = br.readLine().split(" ");
        long one = Long.parseLong(lines[0]);
        long two = Long.parseLong(lines[1]);
        for (long x = 0; x < one; ++x) ht.add(Long.parseLong(br.readLine()));
        for (long x = 0; x < two; ++x) ht2.add(Long.parseLong(br.readLine()));
        ht.retainAll(ht2);
        pw.println(ht.size());
        pw.flush();
    }
}
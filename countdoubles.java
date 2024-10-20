import java.util.*;
import java.io.*;

public class countdoubles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String[] line = br.readLine().split(" ");
        int size = Integer.parseInt(line[0]);
        int subSize = Integer.parseInt(line[1]);

        line = br.readLine().split(" ");
        int doubles = 0, total = 0;
        for (int x = 0; x < size - subSize + 1; ++x) {
            for (int y = x; y < x + subSize; ++y) {
                doubles += 1 - (Integer.parseInt(line[y]) % 2);
            }
            if (doubles > 1) ++total;
            doubles = 0;
        }
        pw.println(total);
        pw.flush();
    }
}
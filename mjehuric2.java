import java.util.*;
import java.io.*;

public class mjehuric2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int[] arr = new int[5];
        String[] line = br.readLine().split(" ");
        for (int x = 0; x < 5; ++x) { arr[x] = Integer.parseInt(line[x]); }
        StringBuilder sb = new StringBuilder();

        boolean swapped = false;
        for (int x = 0; x < arr.length - 1; ++x) {
            swapped = false;
            for (int y = 0; y < arr.length - x - 1; ++y) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    swapped = true;
                    for (int i = 0; i < arr.length; ++i) { sb.append(arr[i]); if (i != arr.length - 1) sb.append(" "); }
                    pw.println(sb.toString());
                    sb.replace(0, sb.length(), "");
                }
            }
            if (!swapped) break;
        }
        pw.flush();
    }
}

import java.io.*;
import java.util.*;
public class nothanks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int size = Integer.parseInt(br.readLine());
        int[] arr = new int[size];
        String[] vals = br.readLine().split(" ");
        for (int x = 0; x < size; x++) { arr[x] = Integer.parseInt(vals[x]); }
        Arrays.sort(arr);
        long sum = arr[0];
        for (int x = size - 1; x > 0; x--) {
            if (arr[x - 1] + 1 != arr[x]) {
                sum += arr[x];
            }
        }
        pw.println(sum);
        pw.flush();
    }
}

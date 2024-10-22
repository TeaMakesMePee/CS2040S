import java.util.*;
import java.io.*;
public class oddmanout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        Set<String> set = new HashSet();
        int outerLoop = Integer.parseInt(br.readLine());
        for (int x = 1; x < outerLoop + 1; ++x) {
            int innerLoop = Integer.parseInt(br.readLine());
            String[] nums = br.readLine().split(" ");
            for (int y = 0; y < innerLoop; ++y) {
                if (!set.add(nums[y])) set.remove(nums[y]);
            }
            pw.println("Case #" + x + ": " + set.toArray()[0]);
            set.clear();
        }
        pw.flush();
    }
}

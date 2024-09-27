import java.io.*;
import java.util.*;
public class jage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        Hashtable<String, String> table = new Hashtable<>();
        SortedSet<String> cheaters = new TreeSet<String>();

        String[] nums = br.readLine().split(" ");
        table.put(br.readLine().split(" ")[0], "");

        int loops = Integer.parseInt(nums[1]);
        for (int x = 0; x < loops; x++) {
            String[] names = br.readLine().split(" ");
            if (table.containsKey(names[0])) {
                table.remove(names[0]);
                table.put(names[2], "");
            } else {
                cheaters.add(names[0]);
                table.put(names[2], "");
            }
        }
        String[] arr = cheaters.toString().replace(",", "").replace("[", "").replace("]", "").split(" ");
        pw.println(cheaters.size());
        for (int x = 0; x < arr.length; x++) { pw.print(arr[x]); if (x != arr.length - 1) { pw.print(" "); } }
        pw.flush();
    }
}
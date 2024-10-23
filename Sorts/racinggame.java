import java.util.*;
import java.io.*;

public class racinggame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        ArrayList<Long> arr = new ArrayList<>();
        boolean isSorted = false;

        int ops = Integer.parseInt(br.readLine());
        for (int i = 0; i < ops; ++i) {
            String[] in = br.readLine().split(" ");
            if (in[0].equals("1")) { //new int
                long num = Long.parseLong(in[1]);
                if (arr.size() < 10 || arr.get(arr.size() - 1) > num) {
                    arr.add(num);
                    isSorted = false;
                    if (arr.size() > 10) { arr.sort((a, b) -> Long.compare(a, b)); arr.remove(10); isSorted = true; }
                }
                if (arr.size() == 10) { arr.sort((a, b) -> Long.compare(a, b)); isSorted = true; }
            } else if (in[0].equals("2")) { //add to all int
                Long add = Long.parseLong(in[1]);
                for (int j = 0; j < arr.size(); ++j) {
                    arr.set(j, arr.get(j) + add);
                }
            } else if (in[0].equals("3")) {
                if (!isSorted) { arr.sort((a, b) -> Long.compare(a, b)); isSorted = true; }
                pw.println(arr.get(Integer.parseInt(in[1]) - 1));
            }
        }
        pw.flush();
    }
}
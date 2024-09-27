import java.io.*;
import java.util.*;
public class inflation2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int size = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        Hashtable<Long, Long> costs = new Hashtable<Long, Long>();
        long totalSum = 0, totalInflation = 0;
        for (int i = 0; i < size; i++) {
            Long cost = Long.parseLong(temp[i]);
            costs.put(cost, costs.getOrDefault(cost, 0L) + 1L);
            totalSum += cost;
        }

        int ops = Integer.parseInt(br.readLine());

        for (int i = 0; i < ops; i++) {
            String[] line = br.readLine().split(" ");
            if (line[0].equals("INFLATION")) {
                Long add = Long.parseLong(line[1]);
                totalSum += add * size;
                totalInflation += add;
            } else {
                Long x = Long.parseLong(line[1]);
                Long y = Long.parseLong(line[2]);
                Long n = costs.getOrDefault(x - totalInflation, 0L);
                totalSum += (y - x) * n;
                costs.remove(x - totalInflation);
                costs.put(x - totalInflation - (x - y), costs.getOrDefault(x - totalInflation - (x - y), 0L) + n);
            }
            pw.println(totalSum);
        }
        pw.flush();
    }
}
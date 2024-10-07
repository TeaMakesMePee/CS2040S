import java.util.*;
import java.io.*;   
public class bokforing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        Hashtable<String, String> map = new Hashtable<>();
        String[] inputs = br.readLine().split(" ");
        int ops = Integer.parseInt(inputs[1]);
        String defaultVal = "0";

        for (int i = 0; i < ops; i++) {
            inputs = br.readLine().split(" ");

            if (inputs[0].equals("SET")) {
                map.put(inputs[1], inputs[2]);
            } else if (inputs[0].equals("PRINT")) {
                pw.println(map.getOrDefault(inputs[1], defaultVal));
            } else if (inputs[0].equals("RESTART")) {
                map.clear();
                defaultVal = inputs[1];
            }
        }

        pw.flush();
    }
}

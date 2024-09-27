import java.io.*;
public class thanos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int lines = Integer.parseInt(br.readLine());
        for (int x = 0; x < lines; ++x) {
            String[] line = br.readLine().split(" ");
            long a = Long.parseLong(line[0]);
            long b = Long.parseLong(line[1]);
            long c = Long.parseLong(line[2]);
            long r = 0;
            while (a <= c) {
                r++;
                a *= b;
            }
            pw.println(r);
        }
        pw.flush();
    }
}
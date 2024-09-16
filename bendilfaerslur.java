import java.util.*;
import java.io.*;

public class bendilfaerslur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String addr = br.readLine();
        boolean ipv4 = !addr.contains(":");

        StringBuilder sb = new StringBuilder();
        if (ipv4) {
            String[] parts = addr.split("\\.");
            for (int x = 3; x > -1; --x) { sb.append(parts[x] + "."); }
        } else {
            String[] parts = addr.split("::");
            
            String right = parts.length > 1 ? parts[1] : "";
            String left = parts.length > 0 ? parts[0] : "";

            String[] leftBlocks = left.isEmpty() ? new String[0] : left.split(":");
            String[] rightBlocks = right.isEmpty() ? new String[0] : right.split(":");

            int numZeroBlocks = 8 - (leftBlocks.length + rightBlocks.length);

            for (int x = rightBlocks.length - 1; x >= 0; --x) {
                for (int y = rightBlocks[x].length() - 1; y >= 0; --y) {
                    sb.append(rightBlocks[x].charAt(y) + ".");
                }

                for (int z = rightBlocks[x].length(); z < 4; ++z) {
                    sb.append("0.");
                }
            }

            for (int y = 0; y < numZeroBlocks * 4; ++y) {
                sb.append("0.");
            }

            for (int x = leftBlocks.length - 1; x >= 0; --x) {
                for (int y = leftBlocks[x].length() - 1; y >= 0; --y) {
                    sb.append(leftBlocks[x].charAt(y) + ".");
                }

                for (int z = leftBlocks[x].length(); z < 4; ++z) {
                    sb.append("0.");
                }
            }
        }
        sb.append(ipv4 ? "in-addr.arpa." : "ip6.arpa.");
        pw.println(sb.toString());
        pw.flush();
    }
}
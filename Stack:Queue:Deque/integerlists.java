import java.util.*;
import java.io.*;

public class integerlists {
    public static void main(String[] args) throws IOException, NoSuchElementException {
        Deque<String> deque = new ArrayDeque<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        boolean front = true;

        for (int x = 0; x < T; x++) {
            String ops = br.readLine();
            int n = Integer.parseInt(br.readLine());
            String[] arr = br.readLine().replace("[", "").replace("]", "").split(",");
            for (int i = 0; i < n; i++) { deque.offer(arr[i]);}

            try {
                for (char i : ops.toCharArray()) {
                    if (i == 'R') { front = !front; } 
                    else { if (front) { deque.removeFirst(); } else { deque.removeLast(); } }
                }

                StringBuilder sb = new StringBuilder();
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(front ? deque.removeFirst() : deque.removeLast());
                    sb.append(!deque.isEmpty() ? "," : "");
                }
                sb.append("]");
                pw.println(sb.toString());
            } catch (NoSuchElementException e) { pw.println("error"); }
            front = true;
        }
        pw.flush();
    }
}
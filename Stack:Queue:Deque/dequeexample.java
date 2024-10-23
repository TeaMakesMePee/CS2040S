import java.util.*;
import java.io.*;
public class dequeexample {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        Deque<Character> s = new ArrayDeque<>(); //declare ass ArrayDeque
        char[] arr = br.readLine().toCharArray();
        for (char c : arr) {
            if (c == '<') {
                if (!s.isEmpty()) {
                    s.pollLast();
                }
            } else { 
                s.add(c);
            }
        }

        while(!s.isEmpty()) pw.print(s.pollFirst()); //check if not empty and poll, dont use size. (size is diff thing)
        pw.flush();
    }
}
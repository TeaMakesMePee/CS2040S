import java.util.*;
import java.io.*;

public class leidangur {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int money = 0, gold = 0, jewel = 0;
        String input = br.readLine();

        Stack<Character> items = new Stack<>();

        for (char c : input.toCharArray()) {
            if (c == 'p' || c == 'g' || c == 'o') { items.push(c); }
            if (c == 'P' || c == 'G' || c == 'O') {
                if (!FindItem(items, (char) (c + 32))) { pw.println("Neibb"); pw.flush(); return; }
            }
        }

        while (!items.isEmpty()) {
            char item = items.pop();
            if (item == 'p') { money += 1; }
            else if (item == 'g') { gold += 1; }
            else if (item == 'o') { jewel += 1; }
        }

        pw.println(money);
        pw.println(gold);
        pw.println(jewel);
        pw.flush();
    }

    public static boolean FindItem(Stack<Character> items, char item) {
        while (!items.isEmpty()) {
            if (items.pop() == item) {
                return true;
            }
        }
        return false;
    }
}
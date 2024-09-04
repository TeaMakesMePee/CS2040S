import java.util.*;

public class cutinline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        ArrayList<String> a = new ArrayList<>();
        while (T-- > 0) {
            String s = sc.nextLine();
            a.add(s);
        }

        T = Integer.parseInt(sc.nextLine());

        while (T-- > 0) {
            String s[] = sc.nextLine().split("\\s");
            if (s[0].equals("leave")) {
                a.remove(s[1]);
            } else if (s[0].equals("cut")) {
                a.add(a.indexOf(s[2]), s[1]);
            }
        }

        for (String s : a) {
            System.out.println(s);
        }
    }
}
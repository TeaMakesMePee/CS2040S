import java.util.*;

public class fyrirtaekjanafn {
    public static void main(String[] args) {
        char[] arr = new Scanner(System.in).nextLine().toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String output = "";
        for (char c : arr) {
            for (char v : vowels) {
                if (c == v) {
                    output += c;
                    break;
                }
            }
        }
        System.out.println(output);
    }
}

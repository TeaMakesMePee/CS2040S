import java.util.*;

public class risdomare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        String type = sc.nextLine();
        
        int result = 0;
        int maxofType = 0;
        int maxSum = 0;
        
        int ind = type.equals("antal") ? 0 : 1;
        
        for (int i = 0; i < T; i++) {
            String s[] = sc.nextLine().split(" ");
            int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            
            int n = Integer.parseInt(s[ind]);
            if (sum > maxSum) {
                maxSum = sum;
                result = i + 1;
                maxofType = n;
            } else if (sum == maxSum) {
                if (n > maxofType) {
                    result = i + 1;
                    maxofType = n;
                }
            }
        }
        System.out.println(result);
    }
}
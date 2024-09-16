import java.util.*;
import java.io.*;

public class rankproblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int teams = Integer.parseInt(line[0]);
        int matches = Integer.parseInt(line[1]);

        String[] arr = new String[teams];
        for (int i = 1; i < teams + 1; i++) { arr[i - 1] = "T" + i; }

        for (int j = 0; j < matches; ++j) {
            String[] match = br.readLine().replace("T", "").split(" ");
            int teamA = Integer.parseInt(match[0]);
            int teamB = Integer.parseInt(match[1]);
        }
    }

    int binarySearch(int arr[], int x)
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}

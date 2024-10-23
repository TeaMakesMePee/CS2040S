import java.io.*;
public class height {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int lines = Integer.parseInt(br.readLine());
        for (int x = 0; x < lines; ++x) {
            String[] vals = br.readLine().split(" ");
            int[] arr = new int[vals.length - 1];
            for (int y = 0; y < vals.length - 1; y++) {
                arr[y] = Integer.parseInt(vals[y + 1]);
            }
            pw.append(x + 1 + " ");
            bubbleSort(arr, arr.length, pw);
        }
        pw.flush();
    }

    static void bubbleSort(int[] arr, int n, PrintWriter pw) {
        int steps = 0;
        for (int x = 0;  x < n - 1; ++x) {
            boolean swapped = false;
            for (int y = 0; y < n - x - 1; ++y) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    swapped = true;
                    steps++;
                }
            }

            if (!swapped) {
                break;
            }
        }
        pw.println(steps);
    }
}
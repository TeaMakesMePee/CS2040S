import java.io.*;;
public class mjehuric {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[5];
        String[] line = br.readLine().split(" ");
        for (int x = 0; x < 5; ++x) { arr[x] = Integer.parseInt(line[x]);}
        bubbleSort(arr, arr.length, pw, sb);
    }

    static void bubbleSort(int[] arr, int n, PrintWriter pw, StringBuilder sb) {
        for (int x = 0;  x < n - 1; ++x) {
            boolean swapped = false;
            for (int y = 0; y < n - x - 1; ++y) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    swapped = true;

                    for (int z = 0; z < arr.length; z++) {
                        sb.append(String.valueOf(arr[z]));
                        if (z != arr.length - 1) { sb.append(" "); }
                    }
                    pw.println(sb.toString());
                    sb.replace(0, sb.length(), "");
                }
            }
            if (!swapped) { break; }
        }
        pw.flush();
    }
}

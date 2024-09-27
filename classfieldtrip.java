import java.io.*;
public class classfieldtrip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        char[] arr1 = br.readLine().toCharArray();
        char[] arr2 = br.readLine().toCharArray();

        int x = 0, y = 0;
        while (x < arr1.length && y < arr2.length) {
            if (arr1[x] < arr2[y]) { 
                pw.append(arr1[x]); x++; 
            } else if (arr1[x] > arr2[y]) { 
                pw.append(arr2[y]); y++; 
            } else {   
                pw.append(arr1[x]); 
                pw.append(arr2[y]);
                x++; y++;
            }
        }

        while (x < arr1.length) { pw.append(arr1[x]); ++x; }
        while (y < arr2.length) { pw.append(arr2[y]); ++y; }
        pw.flush();
    }
}
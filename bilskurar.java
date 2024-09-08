import java.util.*;

public class bilskurar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        HashMap<Integer, Integer> fixedArr = new HashMap<Integer, Integer>();

        for (int i = 0; i < T; i++) {
            fixedArr.put(sc.nextInt(), i);
        }
        sc.nextLine();
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(sort(fixedArr, arr, 0, arr.length - 1));
    }

    static long sort(HashMap<Integer, Integer> farr, int arr[], int l, int r)
    {
        long inv = 0;
        if (l < r) {
            int m = l + (r - l) / 2;
            inv += sort(farr, arr, l, m);
            inv += sort(farr, arr, m + 1, r);
            inv += merge(farr, arr, l, m, r);
        }
        return inv;
    }

    static long merge(HashMap<Integer, Integer> farr, int arr[], int l, int m, int r)
    {
        long inv = 0;
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (farr.get(L[i]) <= farr.get(R[j])) {
                arr[k++] = L[i++];
            }
            else { //inversion happens here
                arr[k++] = R[j++];
                inv += n1 - i;
            }
        }

        while (i < n1) {
            arr[k++] = L[i++];
        }

        while (j < n2) {
            arr[k++] = R[j++];
        }

        return inv;
    }
}
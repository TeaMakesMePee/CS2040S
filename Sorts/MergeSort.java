public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 2, 9, 8, 1};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i + " ");
    }

    public static void sort(int[] arr, int l, int r) {
        if (r - l > 0) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int lsize = m - l + 1;
        int rsize = r - m;
        int L[] = new int[lsize];
        int R[] = new int[rsize];

        for (int x = 0; x < lsize; ++x) L[x] = arr[x + l];
        for (int y = 0; y < rsize; ++y) R[y] = arr[y + m + 1];

        int i = 0, j = 0;
        int k = l;
        while (i < lsize && j < rsize) {
            if (L[i] <= R[j]) { arr[k++] = L[i++];} 
            else {arr[k++] = R[j++];}
        }

        while (i < lsize) {arr[k++] = L[i++];}
        while (j < rsize) {arr[k++] = R[j++];}
    }
}

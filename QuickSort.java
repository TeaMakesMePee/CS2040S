public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 2, 9, 8, 1};
        sort(arr, 0, arr.length - 1);
        for (int i : arr) System.out.print(i);
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int y = l - 1;
            for (int x = l; x < r + 1; ++x) {
                if (arr[x] <= arr[r]) {
                    int temp = arr[x];
                    arr[x] = arr[++y];
                    arr[y] = temp;
                }
            }
            sort(arr, l, y - 1);
            sort(arr, y + 1, r);
        }
    }
}

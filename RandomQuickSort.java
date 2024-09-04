import java.util.Random;

public class RandomQuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 2, 9, 8, 1};
        Random r = new Random();
        sort(arr, 0, arr.length - 1, r);
        for (int i : arr) System.out.print(i);

    }

    public static void sort(int[] arr, int l, int r, Random rand) {
        if (l < r) {
            int n = rand.nextInt(r - l) + l;
            int t = arr[r];
            arr[r] = arr[n];
            arr[n] = t;
            int y = l - 1;
            for (int x = l; x < r + 1; ++x) {
                if (arr[x] <= arr[r]) {
                    int temp = arr[x];
                    arr[x] = arr[++y];
                    arr[y] = temp;
                }
            }
            sort(arr, l, y - 1, rand);
            sort(arr, y + 1, r, rand);
        }
    }
}

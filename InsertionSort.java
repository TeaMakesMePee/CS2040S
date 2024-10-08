public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 9, 4};
        insertionSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void insertionSort(int[] arr, int n) {
        for (int x = 1; x < n; x++) {
            int key = arr[x];
            int y = x - 1;
            while (y > -1 && arr[y] > key) {
                arr[y + 1] = arr[y--];
            }
            arr[y + 1] = key;
        }
    }
}

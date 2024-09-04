public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 3, 9, 4};
        selectionSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void selectionSort(int[] arr, int n) {
        for (int x = 0; x < n - 1; x++) {
            int lowestInd = x;
            for (int y = x + 1; y < n; y++) {
                if (arr[y] < arr[lowestInd]) {
                    lowestInd = y;
                }
            }
            int temp = arr[x];
            arr[x] = arr[lowestInd];
            arr[lowestInd] = temp;
        }
    }
}

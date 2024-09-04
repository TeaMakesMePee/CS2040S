public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        bubbleSort(arr, arr.length);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void bubbleSort(int[] arr, int n) {
        for (int x = 0;  x < n - 1; ++x) {
            boolean swapped = false;
            for (int y = 0; y < n - x - 1; ++y) {
                if (arr[y] > arr[y + 1]) {
                    int temp = arr[y];
                    arr[y] = arr[y + 1];
                    arr[y + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }
}

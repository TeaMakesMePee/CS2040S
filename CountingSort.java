public class CountingSort {
    public static void main(String[] args) {
        int[] inp = {7, 3, 5, 2, 8, 4, 3, 6, 2, 1, 8, 4, 5, 7};
        for (int i : countSort(inp)) {
            System.out.print(i + " ");
        }
    }

    public static int[] countSort(int[] arr) {
        int[] output = new int[arr.length];

        int max = -1;
        for (int i : arr) { if (i > max) max = i; }
        int[] countArr = new int[max + 1];

        for (int i : arr) { countArr[i]++; }

        for (int x = 0; x < countArr.length - 1; ++x) { countArr[x + 1] += countArr[x]; }

        for (int y = arr.length - 1; y > -1; --y) { output[-1 + countArr[arr[y]]--] = arr[y]; }

        return output;
    }
}

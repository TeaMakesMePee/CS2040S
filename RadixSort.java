public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        int max = 0;
        for (int i : arr) {
            int l = String.valueOf(i).length();
            if (l > max) { max = l; }
        }
        for (int i : countSort(arr, 0, max)) { System.out.print(i + " "); }
    }

    public static int[] countSort(int[] arr, int curr, int top) {
        if (curr == top) { return arr; }

        int[] output = new int[arr.length];
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; ++i) {
            int tmp = arr[i];
            for (int j = 0; j < curr; ++j) { tmp /= 10; }
            newArr[i] = tmp % 10;
        }

        int max = -1;
        for (int i : newArr) { if (i > max) max = i; }
        int[] countArr = new int[max + 1];

        for (int i : newArr) { countArr[i]++; }

        for (int x = 0; x < countArr.length - 1; ++x) { countArr[x + 1] += countArr[x]; }

        for (int y = newArr.length - 1; y > -1; --y) { output[-1 + countArr[newArr[y]]--] = arr[y]; }

        return countSort(output, ++curr, top);
    }
}

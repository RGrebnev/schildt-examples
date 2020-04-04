package part6;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 6, 9, 2, 4};

        qsort(arr);

    }

    public static void qsort(int[] arr) {
        System.out.print("before: ");
        printArr(arr);
        qs(arr, 0, arr.length - 1);
        System.out.print("after: ");
        printArr(arr);
    }

    public static void  printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void qs(int[] arr, int left, int right) {
        int i = left, j = right;
        int x = arr[(i + j) / 2];

        do {
            while ((i < right) && (arr[i] < x)) i++;
            while ((j > left) && (arr[j] > x)) j--;

            if (i <= j) {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        } while (i <= j);

        if (i < right) qs(arr, i, right);
        if (j > left) qs(arr, left, j);
    }
}

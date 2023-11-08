package algorithm;

import java.util.Arrays;

public class Sort {

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    public static void print(int[] arr) {

        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("==========================");

    }

    // 버블 정렬 알고리즘은 거품처럼 큰 수부터 오른쪽부터 쌓인다.


    public static void sortByBubbleSort(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
                System.out.println(Arrays.toString(arr));
            }
        }
    }

    // 선택 정렬 알고리즘은 가장 작은 값을 찾아 인덱스 순서대로 swap 해주는 알고리즘이다.
    public static void sortBySelectionSort(int[] arr) {

        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
            System.out.println(Arrays.toString(arr));
        }
    }

    // 삽입정렬은 인덱스 순서대로 정렬을 해 나가는 알고리즘이다.

    public static void sortByInsertionSort(int[] arr) {

        int size = arr.length;

        for (int i = 1; i < size; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && tmp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {

        int[] arr1 = {2, 5, 4, 1, 3};

        sortByBubbleSort(arr1);
        print(arr1);

        int[] arr2 = {2, 5, 4, 1, 3};
        sortBySelectionSort(arr2);
        print(arr2);

        int[] arr3 = {2, 5, 4, 1, 3};
        sortByInsertionSort(arr3);
        print(arr3);
    }
}

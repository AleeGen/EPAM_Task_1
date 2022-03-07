package by.training.array.service.imp;

import by.training.array.entity.CustomArray;
import by.training.array.exception.CustomUniversalException;
import by.training.array.service.ElementSort;

import java.util.Arrays;

public class SortElement implements ElementSort {

    public void bubbleSort(CustomArray customArray) {

        if (customArray.getArray().length <= 1) {
            return;
        }

        int[] array = customArray.getArray();
        int value;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    value = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = value;
                }
            }
        }
        customArray.setArray(array);
    }

    public void quickSort(CustomArray customArray, int start, int end) throws CustomUniversalException {
        int[] array = customArray.getArray();
        if (array.length <= 1) {
            return;
        }
        if (start >= end) {
            throw new CustomUniversalException();
        }
        int middle = start + (end - start) / 2;
        int support = array[middle];

        int i = start, j = end;
        while (i <= j) {
            while (array[i] < support) {
                i++;
            }
            while (array[j] > support) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        customArray.setArray(array);
        if (start < j) {
            quickSort(customArray, start, j);
        }
        if (end > i) {
            quickSort(customArray, i, end);
        }
    }

    public void mergerSort(CustomArray customArray) {
        if (customArray.getArray().length <= 1) {
            return;
        }
        int[] array = customArray.getArray();
        customArray.setArray(sort(array));
    }

    public void streamSort(CustomArray customArray) {
        int[] result = Arrays.stream(customArray.getArray()).sorted().toArray();
        customArray.setArray(result);
    }

    private int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        final int dividePos = array.length / 2;
        int[] array1 = new int[dividePos];
        System.arraycopy(array, 0, array1, 0, array1.length);
        int[] array2 = new int[array.length - dividePos];
        System.arraycopy(array, dividePos, array2, 0, array2.length);
        return merge(sort(array1), sort(array2));
    }

    private int[] merge(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];
        int cursor = 0;
        int cursor1 = 0;
        int cursor2 = 0;
        while (cursor1 < a1.length && cursor2 < a2.length) {
            if (a1[cursor1] > a2[cursor2]) {
                result[cursor++] = a2[cursor2++];
            } else {
                result[cursor++] = a1[cursor1++];
            }
        }

        while (cursor1 < a1.length) {
            result[cursor++] = a1[cursor1++];
        }

        while (cursor2 < a2.length) {
            result[cursor++] = a2[cursor2++];
        }

        return result;
    }

}

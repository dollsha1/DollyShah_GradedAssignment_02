package com.greatlearning.sortandsearch;

public class MergeSort {
	
	public void sortArray(double[] inputArray) {
        sortArray(inputArray, 0, inputArray.length - 1);
    }

    private void sortArray(double[] array, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            sortArray(array, left, middle);

            sortArray(array, middle + 1, right);

            mergeArray(array, left, middle, right);
        }
    }

    private void mergeArray(double[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        double[] Left = new double[n1];
        double[] Right = new double[n2];
        System.arraycopy(array, left, Left, 0, n1);
        for (int j = 0; j < n2; ++j) {
            Right[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            array[k] = Left[i];
            i++;
            k++;
        }
        while (j < n2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }
}
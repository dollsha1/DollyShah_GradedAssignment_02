package com.greatlearning.sortandsearch;

public class BinarySearch {

	   public int searchValue(double[] array, double searchValue) {
	       int left, right, middle;
	       left = 0;
	       right = array.length - 1;
	       middle = left + (right - left) / 2;

	       while (left <= right) {
	           if (searchValue < array[middle]) {
	               right = middle - 1;
	           } else if (searchValue > array[middle]) {
	               left = middle + 1;
	           } else {
	               return middle;
	           }
	           middle = left + (right - left) / 2;
	       }
	       return -1;
	   }

	}


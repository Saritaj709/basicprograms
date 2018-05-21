package com.array.demo;

public class binaryint {

public static int binarySearch(int[] arr, int size, int search) {
    int start = 0;
    int end = size - 1;

    while (start <= end) {
        int mid = (start + end) / 2;
        if (arr[mid] == search) {
            return mid;
        } else if (arr[mid] < search) {
            end = mid - 1;

        } else {
            start = mid + 1;
        }
    }

    return -1;

}
public static void main(String[] args) {

    int[] arr = { 2, 4, 5, 6, 8, 9, 11, 15, 17, 19, 22, 111, 117, 234, 543 };

    int search = 2;
    int size = arr.length;

    int searchPos =binarySearch(arr, size, search);

    if (searchPos == -1) {
        System.out.println("Element not found");
    } else {
        System.out.println("Element found in the position " + searchPos);
    }

}


}


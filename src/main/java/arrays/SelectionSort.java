package arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] myArr = {122, 32, 100, 45, 22};

        System.out.println(Arrays.toString(selectionSort(myArr)));
    }

    public static int[] selectionSort(int[] arr){
        int smallestIndex, size;
        size = arr.length;
        int[] newArr = new int[size];

        for (int i = 0 ; i < newArr.length ; i++){
            smallestIndex = findSmallest(arr);
            newArr[i] = arr[smallestIndex];
            arr = getNewArrWithoutSmallest(arr, smallestIndex);
        }
        return newArr;
    }

    public static int[] getNewArrWithoutSmallest(int[] arr, int smallestIndex) {
        int size = arr.length-1;
        int[] newArrWithoutSmallest = new int[size];
        for (int i = 0; i < size; i++) {
            if (i < smallestIndex) {
                newArrWithoutSmallest[i] = arr[i];
            } else if (i > smallestIndex) {
                newArrWithoutSmallest[i - 1] = arr[i];
            }
        }
        return newArrWithoutSmallest;
    }

    public static int findSmallest(int[] arr){
        int smallest, smallestIndex, size;
        size = arr.length;
        smallest = arr[0];
        smallestIndex = 0;
        for(int i = 0 ; i < size ; i++){
            if (arr[i] < smallest){
                smallest = arr[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}

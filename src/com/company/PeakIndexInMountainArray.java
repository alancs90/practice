package com.company;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[] {1, 1, 1,10,9}));
    }

    public static int peakIndexInMountainArray(int[] arr){
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1] && arr[i]>arr[i-1]){
                return i;
            }
        }
        return -1;
    }
}

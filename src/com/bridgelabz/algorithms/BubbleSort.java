package com.bridgelabz.algorithms;
/**
 Printing the array in sorted way
 Using the Bubble Sort Algorithms
 */
public class BubbleSort {
    public void  sorting(int arr[],int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 ; j++) {
                int t;//taking the swap value
                //swaping function for sorting
                if (arr[j] > arr[j + 1]) {
                    t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }System.out.println("::"+arr[i]);
        }
    }

    public void print(int arr[],int size){
        //printing the array
        for(int i=0;i<size;i++){
            System.out.println(""+arr[i]+"");
        }
    }


    public static void main(String[] args) {
        BubbleSort bubblesort=new BubbleSort();
        int arr[]={34,3423,23,6,677};
        int n=arr.length;
        bubblesort.sorting(arr,n);
        System.out.println("array is after sorting:");
        bubblesort.print(arr,n);
    }
}
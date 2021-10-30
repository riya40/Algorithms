/**
 * Printing and Sorting the String Values
 * Using the Insertion sort
 */
package com.bridgelabz.algorithms;

public class InsertionSort {
    public void sorting(String arr[], int n){

        for(int i=0;i<n;++i){
            for(int j=i+1;j<n;j++ ) {
                if(arr[i].compareToIgnoreCase(arr[j])>0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public void print(String arr[],int f){
        f=arr.length;
        for(int i=0;i<f;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        InsertionSort insertionsort=new InsertionSort();
        String arr[]={"riya","sankar","jenny","chris"};
        int n=arr.length;
        insertionsort.sorting(arr,n);
        insertionsort.print(arr,n);
    }
}
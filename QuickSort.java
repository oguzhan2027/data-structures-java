/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oguzhan
 */
public class QuickSort {public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        /* pi is partitioning index, arr[p] is now
           at right place */
        int pi = partition(arr, low, high);
 
        // Recursively sort elements before
        // partition and after partition
        quickSort(arr, low, pi-1);
        quickSort(arr, pi+1, high);
    }
}

public static int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = (low-1); // index of smaller element
    for (int j=low; j<high; j++)
    {
        // If current element is smaller than or
        // equal to pivot
        if (arr[j] <= pivot)
        {
            i++;
 
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
 
    // swap arr[i + 1] and arr[high]
    int temp = arr[i+1];
    arr[i+1] = arr[high];
    arr[high] = temp;
 
    return i+1;
}
public static void main(String[] args) {
       
    }
    
}

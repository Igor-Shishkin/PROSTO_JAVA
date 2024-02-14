package com.prosto.java.algoritms;

import java.util.Arrays;

public class QuickSortAlgorythm {
    public static void main(String[] args) {

        int[] arr = {1, 7, 4, 6, 9, 8, 1, 6, 5};
        System.out.println("Origin array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));

    }


    // Główna funkcja implementująca QuickSort
    // arr[] --> Tablica do posortowania,
    // low --> Indeks początkowy,
    // high --> Indeks końcowy
    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            System.out.println("\nBefore: " + Arrays.toString(arr) + ", low: " + low + ", high: " + high);
            //Ta metoda przyjmuje ostatni element jako PIVOT, umieszcza PIVOT
            //na właściwej pozycji w posortowanej tablicy i umieszcza wszystkie
            //mniejsze elementy na lewo od PIVOTU, a wszystkie
            //większe elementy na prawo od PIVOTU
            int pi = partition(arr, low, high);

            // oddzielnie sortujemy elementy przed 'pi' po 'pi'
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


//    Ta metoda przyjmuje ostatni element jako PIVOT, umieszcza PIVOT
//    na właściwej pozycji w posortowanej tablicy i umieszcza wszystkie
//    mniejsze elementy na lewo od PIVOTU, a wszystkie
//    większe elementy na prawo od PIVOTU
    private static int partition(int[] arr, int low, int high) {

        // Wybieramy PIVOT
        int pivot = arr[high];
        // Indeks borderIndex - indeks pierwszego elementu większego od PIVOT
        int borderIndex = low;

        // Jeśli bieżący element jest mniejszy niż PIVOT
        for (int i = low; i < high; i++) {

            if (arr[i] < pivot) {
                // zamieniamy miejscami elementy
                swap(arr, i, borderIndex);
                //przesuwamy borderIndex na jeden
                borderIndex++;
            }
        }
        swap(arr, high, borderIndex);
        return borderIndex;
    }


    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}

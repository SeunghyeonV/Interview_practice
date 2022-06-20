#include <iostream>
using namespace std;

// use any sort to arrange the given array in descending order

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}


void bubbleSort(int arr[], int n) {
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n-1-i; j++) {
            if (arr[j] < arr[j+1]) {
                swap (arr[j], arr[j+1]);
            }
        }
    }
}

void merge(int arr[], int sortedArr[], int left, int center, int right) {
    int i = left;
    int j = center + 1;
    int k = left;

    while (i <= center && j <= right) {
        if (arr[i] >= arr[j]) {
            sortedArr[k] = arr[i];
            i++;
        }

        else {
            sortedArr[k] = arr[j];
            j++;
        }
        k++;
    }

    if (i > center) {
        for (int t = j; t <= right; t++) {
            sortedArr[k] = arr[t];
            k++;
        }
    }

    else {
        for (int t = i; t <= center; t++) {
            sortedArr[k] = arr[t];
            k++;
        }
    }

    for (int t = left; t <= right; t++) {
        arr[t] = sortedArr[t];
    }
}

void mergeSort(int arr[], int sortedArr[], int left, int right) {
    if (left < right) {
        int center = (left + right) / 2;
        mergeSort (arr, sortedArr, left, center);
        mergeSort (arr, sortedArr, center + 1, right);
        merge (arr, sortedArr, left, center, right);
    }
}

int main() {
    int n;
    cin >> n;
    int arr[n];
    int sorted[n]; // use for merge sort
    int input;
    for (int i = 0; i < n; i++) {
        cin >> input;
        arr[i] = input;
    }

    // bubbleSort(arr, n);
    mergeSort(arr, sorted, 0, n-1);
    for (int i = 0; i < n; i++) {
        cout << arr[i] << " ";
    }
}
#include <iostream>
#include <bits/stdc++.h>
#include <iostream>
#include <array>
using namespace std;

void leftRotatebyOne(int arr[], int n) {
    int temp = arr[0];
    for (int i=0; i<n-1; i++) {
        arr[i] = arr[i+1];
    }
    arr[n-1] = temp;
    
}

void leftRotate(int arr[], int d, int n) {

    for (int i = 0; i < d; i++)
        leftRotatebyOne(arr, n);
}


void print(int arr[], int n) {
 for (int i=0; i < n; i++) {
     cout << arr[i];
    }
}


int main() {
    int arr[] = {1,2,3,4,5,6,7};
    int temp = arr[0];
    int n = sizeof(arr)/sizeof(arr[0]); //returns array size 
    // cout << *(&arr + 1) - arr << endl; //returns array size

    leftRotate(arr, 3, n);
    print(arr, n);
    return 0;

}
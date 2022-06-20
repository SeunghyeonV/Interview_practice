#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int binarySearch(vector <int> arr, int target, int start, int end) {
    if (start > end) return -1;
    int mid = (start + end) / 2;

    if (arr[mid] == target) return mid;

    else if (arr[mid] > target) return binarySearch(arr, target, start, mid-1);

    else return binarySearch(arr, target, mid+1, end);

}

vector <int> arr;
vector <int> arr2;
int n, m;

int main() {
    cout << "Enter the number of array elements: " << endl;
    cin >> n;

    cout << "Enter the array elements: " << endl;
    for(int i = 0; i < n; i++) {
        int input;
        cin >> input;
        arr.push_back(input);
    }

    cout << "Enter the number of array2 elements: " << endl;
    cin >> m;

    cout << "Enter the array2 elements: " << endl;
    for(int i = 0; i < m; i++) {
        int input;
        cin >> input;
        arr2.push_back(input);
    }

    sort(arr.begin(), arr.end());
    for (int i = 0; i < m; i++) {
        int result = binarySearch(arr, arr2[i], 0, n-1);
        if (result != -1) {
             cout << "yes" << endl;
        }
        else {
            cout << "no" << endl;
        }
    }
    return 0;
}
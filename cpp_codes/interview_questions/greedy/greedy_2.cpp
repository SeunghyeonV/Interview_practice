# include <iostream>
# include <vector>
using namespace std;
// Rule of big numbers
// N = number of elements in array
// M = total number of addition
// K = number of available repetition

void swap (int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

void printArray(int arr[], int n) {
    for (int i=0; i < n; i++) {
        cout << arr[i] << " ";
    }
}

int *selectionSort(int arr[], int n) {
    for (int i=0; i < n-1; i++) {
        int least = i;
        for (int j = i+1; j < n; j++) {
            if (arr[least] > arr[j]) {
                least = j;
            }
        }
        
        swap(arr[i], arr[least]);
    }
    return arr;
}

int main() {
    int N, M, K;
    cin >> N >> M >> K;
    int arr[5];

    for (auto &item : arr) {
        cin >> item;
    }

    selectionSort(arr, 5);
    int last_elem = arr[sizeof(arr)/sizeof(arr[0])-1];
    int second_last = arr[sizeof(arr)/sizeof(arr[0])-2];

    int result = 0;
    int a = M / K;
    int b = M - (a);

    cout << a << b << endl;
    cout << last_elem * b + second_last*a << endl;

    // printArray(arr, 5);

}
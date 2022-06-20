// https://www.acmicpc.net/problem/11399
#include <bits/stdc++.h>
using namespace std;

int main () {
    int n;
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++) {
        int p;
        cin >> p;
        arr[i] = p;
    }

    sort(arr, arr+n);

    int total = 0;
    for (int i = 0; i < n; i++) {
        total += (n-i) * arr[i];
    }

    cout << total << endl;
}
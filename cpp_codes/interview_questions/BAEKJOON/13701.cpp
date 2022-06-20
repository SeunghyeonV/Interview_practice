#include <bits/stdc++.h>
using namespace std;
// https://www.acmicpc.net/problem/13701
// failed

int arr[1<<20];
int main() {
    
    int n;
    while (cin >> n) {
        int q = n/32;
        int r = 1 << (n%32);
        if (!(arr[q]&r)) {
            arr[q] += r;
            cout << n << " ";
        }
    }
    return 0;
}
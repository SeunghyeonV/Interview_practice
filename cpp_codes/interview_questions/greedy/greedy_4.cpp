#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

// Repeatedly perform one of given task until the given number N becomes 1.
// 1. N - 1
// 2. N / K
// return the minimum number of repeated task. ex) 25 5 -> 2
int main() {
    int N, K;
    cin >> N >> K;
    int count;

    while (N >= K) {
        while (N % K != 0) {
            N = N - 1;
            count += 1;
        }
        N = N / K;
        count += 1;
    }

    while (N > 1) {
        N = N - 1;
        count += 1;
    }

    cout << count;
}
#include <iostream>
using namespace std;
// https://www.acmicpc.net/problem/13699
const int MAX = 35 + 1;
int N;
long long t[MAX];

int main() {
    cin >> N;     
    t[0] = 1;
    for (int i = 1; i < MAX; i++)
        for (int j = 0; j <= i - 1; j++)
            t[i] += t[j] * t[i - 1 - j];

    cout << t[N] << endl;
    return 0;
}


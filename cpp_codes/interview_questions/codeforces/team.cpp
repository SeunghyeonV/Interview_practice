// https://codeforces.com/problemset/problem/231/A
#include <iostream>
using namespace std;
int main() {
    int n;
    cin >> n;
    int count = 0;
    for (int i = 0; i < n; i++) {
        int x, y, z;
        cin >> x >> y >> z;
        if (x+y+z >= 2) {
            count += 1;
        }
    }
    cout << count;
}
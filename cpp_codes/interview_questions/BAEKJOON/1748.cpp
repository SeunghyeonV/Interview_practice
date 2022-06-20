#include <bits/stdc++.h>
using namespace std;
int main () {
    long long n;
    cin >> n;
    // my solution - memory exceeded
    // vector <string> strarr;
    // string temp;
    // for (int i = 1; i <= n; i++) {
    //     string s = to_string(i);
    //     temp += s;
    // }
    // cout << temp.length() << endl;

    int i = 1;
    int solution = 0;
    while (i <= n) {
        solution = solution + (n-i+1);
        i = i * 10;
    }

    cout << solution << endl;
    return 0;
}
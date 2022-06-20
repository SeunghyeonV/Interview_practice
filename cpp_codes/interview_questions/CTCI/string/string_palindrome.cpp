#include <bits/stdc++.h>
using namespace std;

int main () {
    string s;
    getline(cin, s);

    vector <char> arr1;
    for (int i = 0; i < s.length(); i++) {
        if(s[i] != ' ') {
        arr1.push_back(s[i]);
        }
    }

    vector <char> arr2;
    for (int i = 1; i < s.length()+1; i++) {
        if (s[i] != ' ') {
        arr2.push_back(s[s.length()-i]);
        }
    }    

    int count = 0;
    int i = 0;
    while (i < s.length()) {
        if (arr1[i] != arr2[i]) {
            count++;
        }
        i++;
    }

    if (count != 0) { return false; }
    else { return true; }

    return 0;
}
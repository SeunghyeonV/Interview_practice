#include <bits/stdc++.h>
using namespace std;
/* Write a method to replace all spaces in a string with '%20'.
You may assume that the string has sufficient space at the end
to hold the additional charactersand that
you are given the true length of the string. */

// solution - use push_back for string
int main() {
    string s;
    getline(cin, s);
    string replace = "%20";

    vector <string> arr2;
    for (int i = 0; i < s.length(); i++) {
        string temp;
        temp.push_back(s[i]);
        arr2.push_back(temp);
    }

    for (int i = 0; i < arr2.size(); i++) {
        if (arr2[i] == " ") {
            arr2[i] = replace;
        }
    }

    for (auto &elem: arr2) {
        cout << elem << "";
    }

}
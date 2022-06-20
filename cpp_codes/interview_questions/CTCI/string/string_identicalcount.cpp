#include <bits/stdc++.h>
using namespace std;
// Check if the two strings have identical character counts.
// solution - make two vectors for saving s1 and s2 as char
// compare v1 and v2 and if the element of v1 is spotted in v2, then remove the element from v2
// after comparing two vectors, check if there is still remaining element in v2.
// if v2 is empty, s1 and s2 have same character counts.

int main() {
    string s1;
    getline(cin, s1);
    string s2;
    getline(cin, s2);

    sort(s1.begin(), s1.end());
    sort(s2.begin(), s2.end());

    if (s1.length() != s2.length()) return false;

    vector <char> temp1;
    vector <char> temp2;
    for (int i = 0; i < s1.length(); i++) {
        temp1.push_back(s1[i]);
    }

    for (int i = 0; i < s2.length(); i++) {
        temp2.push_back(s2[i]);
    }

    for (int i = 0; i < temp1.size(); i++) {
        for (int j = 0; j < temp2.size(); j++) {
            if (temp1[i] == temp2[j]) {
                temp2.erase(temp2.begin()+j);
            }
        }
    }

    if (temp2.size() != 0) {
        return false;
    }
    return true;

    return 0;
}
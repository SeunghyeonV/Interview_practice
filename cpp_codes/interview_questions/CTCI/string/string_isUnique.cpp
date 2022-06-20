#include <bits/stdc++.h>
using namespace std;
// Implement an algorithm to determine if all characters in a string are unique.
// do not use any additional data structures.

bool isUnique(string s) {
    sort(s.begin(), s.end());
    for (int i = 0; i < s.length()-1; i++) {
        if (s[i] == s[i+1]) {
            return false;
        }
    }
    return true;
}

bool isUnique(string s) {
    for (int i = 0; i < s.length()-1; i++) {
        for (int j = i+1; j < s.length(); j++) {
            if (s[i] == s[j]) return false;
        }
    }
    return true;
}

bool isUnique(string s) {
    set<char> char_set;
    for (char c : s) {
        char_set.insert(c);
    }
    if (char_set.size() == s.size()) {
        return true;
    }
    else {
        return false;
    }
}


int main () {
    string s;
    getline(cin, s);

    if(isUnique(s)) {
        cout << "true" << endl;
    }
    else {
        cout << "false" << endl;
    }
}
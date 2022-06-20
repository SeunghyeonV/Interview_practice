#include <iostream>
#include <vector>
using namespace std;

int main() {
    char string[8] = "abcdefg";
    vector <int> arr = {1,2,3,4,5,6,7};
    vector <int> arr2 = {};

    for(int i = 0; i < (sizeof(string)/sizeof(string[0])); i++) {
        cout << string[i];
    }
    cout << endl;

    for(int i = (sizeof(string)/sizeof(string[0])); i >= 0; i--) {
        cout << string[i];
    }

    for(int i = arr.size(); i >= 0; i--) {
        arr2.push_back(i);
    }

    for (int i=0; i < arr.size(); i++) {
        cout << arr2[i];
    }

    return 0;
}
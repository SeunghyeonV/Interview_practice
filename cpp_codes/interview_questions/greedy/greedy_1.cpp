#include <iostream>
#include <array>
#include <algorithm>
using namespace std;

// counting number of coins for change

int main() {
    int N = 1250; // change need to give
    int count = 0; // number of coins


    // solution 1
    int arr[] = {500, 100, 50, 10};
    for (int i = 0; i < sizeof(arr)/sizeof(arr[0]); i++) {
        count += N / arr[i];
        N = N % arr[i];
    }

    // solution 2
    array <int, 4> coin_type = {500,100,50,10};
    for (auto &coin : coin_type) {
        count += N / coin;
        N = N % coin;
    }

    cout << count << endl;
    return 0;
}

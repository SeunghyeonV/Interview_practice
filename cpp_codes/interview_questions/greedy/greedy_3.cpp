#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// you can select the smallest number from each row
// make the sum of chosen number the as big as possible

int main() {
    int n, m, value;
    cin >> m >> n;
    // fill in the array
    vector <vector<int>> arr;
    for (int i=0; i<m; i++) {
        vector <int> temp;
        for (int j=0; j<n; j++) {
            cin >> value;
            temp.push_back(value);
        }
        arr.push_back(temp);
    }

    // sort array to get the smallest value of each row of an 2d array
    for (int i=0; i<m; i++) {
        for (int j=0; j<n; j++) {
            sort(arr[i].begin(), arr[i].end()); // ascending order
            // sort(arr[i].begin(), arr[i].end(), greater<int>()); // descending order
        }
    }

    // print 2d array
    // for (int i=0; i<m; i++) {
    //     for (int j=0; j<n; j++) {
    //         cout << arr[i][j] << " ";
    //     }
    //     cout << endl;
    // }

    // define a new array that saves the smallest value of 2d array
    vector <int> min_val = {};
    for (int i=0; i<m; i++) {
        min_val.push_back(arr[i][0]);
    }

    // sort the new array to find the largest value between the smallest value of each row 
    sort(min_val.begin(), min_val.end(), greater<int>());
    cout << min_val[0]; 

    // for (int i=0; i<m; i++) {
    //     for (int j=0; j<n; j++) {
    //         cout << arr[i][j] << " ";
    //     }
    //     cout << endl;
    // }

}
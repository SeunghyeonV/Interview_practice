#include <iostream>
#include <algorithm>
using namespace std;

class Student {
    public:
    string name;
    int score;

    Student (string name, int score) {
        this -> name = name;
        this -> score = score;
    }

    // bool operator < (Student &student) {
    //     return this -> score < student.score;
    // }

    bool operator < (Student &student) {
        return this -> score < student.score;
    }
};

bool compare (int a, int b) {
    return a > b;
}

int main() {
    int n;
    cin >> n;
    string name;
    int score;

    int student_score[n];

    for (int i=0; i<n; i++) {
        cin >> name >> score;
        student_score[i] = (name, score);

    }

    for (int i = 0; i < n; i++) {
        cout << student_score[i] << " ";
    }


    // Student students[] {
    //     Student ("Shin", 80),
    //     Student ("Kim", 86),
    //     Student ("John", 78),
    //     Student ("Crowe", 91),
    // };

    // sort(students, students+4);

    // for (int i = 0; i < sizeof(students)/sizeof(students[0]); i++) {
    //     cout << students[i].name << endl;
    // }
}
#include <bits/stdc++.h>
using namespace std;

class Node {
    char left;
    char right;
};

Node tree[27];
void preOrder(char Node) {
    if (Node == '.') return;
    cout << Node;
    preOrder(tree[Node].left);
    preOrder(tree[Node].right);
}
#include <bits/stdc++.h>
#include <vector>
#include <array>

using namespace std;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("shuffle.in", "r", stdin);
    freopen ("shuffle.out", "w", stdout);

    int n;
    cin >> n;

    vector <int> temp;
    vector <int> shuffle;
    vector <int> sol (n);
    vector <string> codes; 

    for (int i = 0; i < n; i ++){
        temp.push_back(i);
    }

    for (int i = 0; i < n; i ++){
        int a;
        cin >> a;
        a--;
        shuffle.push_back(a);
    }

    for (int i = 0; i < 3; i ++){
        for (int i = 0; i < n; i ++){
            sol.at(i) = temp.at(shuffle.at(i));
        }
        temp = sol; 
    }

    for (int i = 0; i < n; i ++){
        string str;
        cin >> str;
        codes.push_back(str);
    }

    for (int i: sol){
        cout << codes.at(i) << "\n";
    }

}
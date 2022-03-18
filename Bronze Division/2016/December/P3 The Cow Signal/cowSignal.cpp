#include <bits/stdc++.h>
#include <vector>

using namespace std;

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("cowsignal.in", "r", stdin);
    freopen ("cowsignal.out", "w", stdout);

    int a, b, k;
    cin >> a >> b >> k;

    vector <string> ans;

    for (int i = 0; i < a; i ++){
        string str;
        string add = "";
        cin >> str;
        
        for (int j = 0; j < b; j ++){
            char c = str.at(j);
            for (int l = 0; l < k; l ++){
                add += c;
            }
        }
        for (int j = 0; j < k; j ++){
            ans.push_back(add);
        }
    }

    for (string s: ans){
        cout << s << "\n";
    }
}
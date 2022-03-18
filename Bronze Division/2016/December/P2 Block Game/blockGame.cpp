#include <bits/stdc++.h>
using namespace std;

int main (){
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("blocks.in", "r", stdin);
    freopen ("blocks.out", "w", stdout);

    int n;
    cin >> n;

    int ans [26] = { };

    for (int i = 0; i < n; i ++){
        string a, b;
        int first [26] = { };
        int second [26] = { };
        cin >> a >> b;

        for (int j = 0; j < a.length(); j ++){
            first [a.at(j)-97] ++;
        }
        for (int j = 0; j < b.length(); j ++){
            second [b.at(j)-97] ++;
        }

        for (int j = 0; j < 26; j ++){
            ans [j] += max(first[j], second[j]);
        }
    }

    for (int i: ans){
        cout << i << "\n";
    }
}

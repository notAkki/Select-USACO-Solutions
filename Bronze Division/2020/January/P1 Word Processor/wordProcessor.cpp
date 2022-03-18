#include <bits/stdc++.h>

using namespace std;

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen("word.in", "r", stdin);
    freopen("word.out", "w", stdout);

    int n, m;
    string str;
    cin >> n >> m >> str;
    int l = str.size();

    cout << str;

    for (int i = 1; i < n; i ++){
        string a;
        cin >> a;
        l += a.size();

        if (l <= m){
            cout << " " << a;
        }
        else {
            cout << "\n" << a;
            l = a.size();
        }
    }
}
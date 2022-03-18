#include <bits/stdc++.h>

using namespace std;

int main (){
    ios::sync_with_stdio(0);
    cin.tie (0);

    freopen ("paint.in", "r", stdin);
    freopen ("paint.out", "w", stdout);

    int a, b, c, d;

    cin >> a >> b >> c >> d;

    bool arr [101];
    int total = (b - a) + (d - c);
    int interval = (max (min (b,d) - max (a, c), 0));

    cout << total - interval<< "\n";
}
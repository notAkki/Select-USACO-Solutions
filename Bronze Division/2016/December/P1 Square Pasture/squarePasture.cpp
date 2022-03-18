#include <bits/stdc++.h>

using namespace std;

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("square.in", "r", stdin);
    freopen ("square.out", "w", stdout);

    int a, b, c, d, w, x, y, z;
    cin >> a >> b >> c >> d >> w >> x >> y >> z;

    int left = min (a, w);
    int right = max(c, y);
    int bottom = min (b, x);
    int top = max (d, z);

    int ans = max ((right-left), (top-bottom));
    cout << ans*ans << "\n";
}
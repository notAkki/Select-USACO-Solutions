#include <bits/stdc++.h>

using namespace std;

int main() {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen("teleport.in", "r", stdin);
    freopen("teleport.out", "w", stdout);

    int a, b, x, y;
    cin >> a >> b >> x >> y;

    int dist = abs(a-b);
    int option1 = abs(a-x) + abs(b-y);
    int option2 = abs(a-y) + abs(b-x);

    int tp = min(option1, option2);
    cout << min(dist, tp) << "\n";
}
    
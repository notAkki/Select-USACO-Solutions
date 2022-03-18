#include <bits/stdc++.h>
#include <vector>
#include <array>

using namespace std;

array <int, 100> road;
array <int, 100> ride;

int speeding (int i){
    return ride[i] - road[i];
}

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("speeding.in", "r", stdin);
    freopen ("speeding.out", "w", stdout);

    int ans = 0;
    int n, m;
    cin >> n >> m;

    int start, end = 0;
    for (int i = 0; i < n; i ++){
        int a, b;
        cin >> a >> b;
        end = start + a;
        for (int j = start; j < end; j ++){
            road [j] = b;
        }
        start = end;
    }

    start = 0;
    for (int i = 0; i < m; i ++){
        int a, b;
        cin >> a >> b;
        end = start + a;
        for (int j = start; j < end; j ++){
            ride [j] = b;
        }
        start = end;
    }

    for (int i = 0; i < 100; i ++){
        ans = max (ans, speeding (i));
    }

    cout << ans << "\n";
}
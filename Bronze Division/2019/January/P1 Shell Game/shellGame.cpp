#include <bits/stdc++.h>
#include <array>

using namespace std;

int main () {
    ios::sync_with_stdio(0);
    cin.tie(0);

    freopen ("shell.in", "r", stdin);
    freopen ("shell.out", "w", stdout);

    int n;
    cin >> n;
    array <int, 3> shells = {0, 1, 2};
    array <int, 3> scores = {0, 0, 0};

    for (int i = 0; i < n; i ++){
        int a, b, g;
        cin >> a >> b >> g;
        a--; b--; g--;

        swap (shells[a], shells[b]);
        scores [shells[g]] ++;
    }
    
    int total = max(scores [0], scores[1]);
    total = max(total, scores [2]);

    cout << total << "\n";
}

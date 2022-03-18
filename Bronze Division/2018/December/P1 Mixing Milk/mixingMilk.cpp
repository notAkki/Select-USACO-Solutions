#include <bits/stdc++.h>
#include <array>

using namespace std;
array <int, 3> volume;
array <int, 3> capacity;

void pour (int i, int j){
    int pourable = min(volume[i], capacity[j] - volume[j]);
    volume [i] -= pourable;
    volume [j] += pourable;
}

int main (){
    ios::sync_with_stdio (0);
    cin.tie (0);

    freopen ("mixmilk.in", "r", stdin);
    freopen ("mixmilk.out", "w", stdout);

    int cap1, cap2, cap3, a, b ,c;
    cin >> cap1 >> a >> cap2 >> b >> cap3 >> c;
    volume = {a, b, c};
    capacity = {cap1, cap2, cap3};

    for (int i = 0; i < 4; i ++){
        pour (i%3, (i+1)%3);
        //cout << volume [0] << " " << volume [1] << " " << volume [2]<< "\n";
    }

    for (int n: volume){
        cout << n << "\n";
    }
}



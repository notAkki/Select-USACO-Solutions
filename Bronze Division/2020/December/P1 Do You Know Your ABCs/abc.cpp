#include <bits/stdc++.h>

using namespace std;

int main() {
   ios::sync_with_stdio(0);
   cin.tie(0); 

    int arr[7];
    for (int i = 0; i < 7; i ++){
        int a;
        cin >> a;
        arr[i] = a;
    }
    sort (arr, arr+7);

    cout << arr[0] << " " << arr[1] << " " << arr[6] - arr[0] - arr[1] << "\n";
}
    
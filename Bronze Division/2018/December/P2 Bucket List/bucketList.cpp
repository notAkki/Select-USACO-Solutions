#include <bits/stdc++.h>
#include <vector>
#include <array>

using namespace std;

int main (){
    ios::sync_with_stdio (0);
    cin.tie (0);

    freopen ("blist.in", "r", stdin);
    freopen ("blist.out", "w", stdout);

    int n;
    cin >> n;

    int done = 0;
    vector <int> buckets;
    vector <int> starting;
    vector <int> ending;

    int total = 0;

    for (int i = 0; i < n; i ++){
        int a, b, c;
        cin >> a >> b >> c;
        a--; b--;
        starting.push_back(a);
        ending.push_back(b);     
        buckets.push_back(c);  
    }

    int i = 0;
    int cur = 0;
    while (done < n){
        vector<int>::iterator a;
        a = find (starting.begin(), starting.end(), i);
        if (a != starting.end()){
            int index = distance (starting.begin(), a);
            cur += buckets.at(index);
        } 
        vector<int>::iterator b;
        b = find (ending.begin(), ending.end(), i);
        if (b != ending.end()){
            int index = distance (ending.begin(), b);
            cur -= buckets.at(index);
            done += 1;
        }
        total = max(total, cur);
        i++;
    }

    cout << total << "\n";
}
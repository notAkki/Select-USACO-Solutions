import java.util.*;
import java.io.*;
public class Main {
static BufferedReader br;
static PrintWriter out;
static StringTokenizer st;
static String next() throws IOException {
while (st == null || !st.hasMoreTokens())
st = new StringTokenizer(br.readLine().trim());
return st.nextToken();
}
static long readLong() throws IOException {
return Long.parseLong(next());
}
static int readInt() throws IOException {
return Integer.parseInt(next());
}
static double readDouble() throws IOException {
return Double.parseDouble(next());
}
static char readCharacter() throws IOException {
return next().charAt(0);
}
static String readLine() throws IOException {
return br.readLine().trim();
}


    static class Pair {
        int x;
        String y;
        int z;
        public Pair(int x, String y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Compare {
        void compare(Pair arr[], int n) {
        Arrays.sort(arr, new Comparator<Pair>() {
        @Override public int compare(Pair p1, Pair p2){
        return p1.x - p2.x;
        }
        });
        }
    }
    
    public static char update (int a, int b, int c){
        if (a > b && a > c){
            return 'a';
        }
        else if (b > a && b > c) {
            return 'b';
        }
        else if (c > a && c > b) {
            return 'c';
        }
        else if (a == b && a == c){
            return 'd';
        }
        else if (a ==b && a > c){
            return 'e';
        }
        else if (a == c && a > b){
            return 'f';
        }
        else if (b  ==c && b > a){
            return 'g';
        }
        return 'z';
    }

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new FileReader("measurement.in"));
        out = new PrintWriter(new FileWriter("measurement.out"));


        int n = readInt();

        Pair [] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr [i] = new Pair (readInt(), next(), readInt());
        }

        Compare obj = new Compare ();
        obj.compare (arr, n);

        int m = 0;
        int b = 0;
        int e = 0;
        
        char checker = 'd';
        int total = 0;

        for (int i = 0; i < n; i++) {
            Pair temp = arr[i];
            if (temp.y.charAt(0) == 'M'){
                m += temp.z;
            }
            else if (temp.y.charAt(0) == 'B'){
                b += temp.z;
            }
            else {
                e += temp.z;
            }

            if (update(m,b,e) != checker){
                total ++;
                checker = update (m,b,e);
            }
        }

        out.println (total);
        out.close();
    }

}

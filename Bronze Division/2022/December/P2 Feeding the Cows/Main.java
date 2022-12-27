import java.util.*;
import java.io.*;
public class Main {
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
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
    public static void main(String[] args) throws IOException {
        int T = readInt();

        for (int t = 0; t < T; t ++){
            int N = readInt();
            int k = readInt();

            int gCount = 0;
            int hCount = 0;

            String start = readLine();

            if (k == 0){
                System.out.println (N);
                System.out.println (start);
                continue;
            }

            char [] ans = new char[N];
            int gPos = 0;
            int hPos = 0;

            for (int i = 0; i < N; i ++){
                if (start.charAt(i) == 'G'){
                    gCount ++;
                    if (gCount == 1){
                        gPos = Math.min(N-1,i+k);
                        if (ans[gPos] =='H')
                            gPos --;
                        ans[gPos] = 'G';
                    }
                    else {
                        if (gPos >= Math.max(0,i-k) && gPos <= Math.min(N-1,i+k)){
                            continue;
                        }
                        else {
                            gPos = Math.min(N-1,i+k);
                            if (ans[gPos] =='H')
                                gPos --;
                            ans[gPos] = 'G'; 
                        }
                    }
                }
                else {
                    hCount ++;
                    if (hCount == 1){
                        hPos = Math.min(N-1,i+k);
                        if (ans[hPos] =='G')
                            hPos --;
                        ans[hPos] = 'H';
                    }
                    else {
                        if (hPos >= Math.max(0,i-k) && hPos <= Math.min(N-1,i+k)){
                            continue;
                        }
                        else {
                            hPos = Math.min(N-1,i+k);
                            if (ans[hPos] =='G')
                                hPos --;
                            ans[hPos] = 'H'; 
                        }
                    }
                }
            }

            int total = 0;
            // String lawn = "";
            StringBuilder lawn = new StringBuilder ();
            for (char c: ans){
                if (c == 'G' || c == 'H'){
                    total ++;
                    lawn.append(c);
                }
                else {
                    lawn.append(".");
                }
            }

            System.out.println (total);
            System.out.println (lawn);

        }
    }
}

class Pair {
    int x;
    int y;
    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
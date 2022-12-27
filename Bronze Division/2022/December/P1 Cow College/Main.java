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
        int n = readInt ();
        int [] arr = new int [n];
        for (int i = 0; i < n; i ++){
            arr [i] = readInt ();
        }

        Arrays.sort (arr);
        
        long max = 0;
        long maxMoney = 0;

        for (int i = 0; i < n; i ++){
            long temp = (long) (n-i)*(long)arr[i];
            if (temp > max){
                max = temp;
                maxMoney = arr[i];
            }
        }

        System.out.println (max + " " + maxMoney);
    }
}
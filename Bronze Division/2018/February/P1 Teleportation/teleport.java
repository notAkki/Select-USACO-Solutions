import java.io.*;
import java.util.*;

public class teleport {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
    
        public FastReader() throws IOException {
            br = new BufferedReader(new FileReader("teleport.in"));
        }
    
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
    
        int nextInt() { return Integer.parseInt(next()); }
    
        long nextLong() { return Long.parseLong(next()); }
    
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
    
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main (String [] args) throws IOException {
        FastReader in = new FastReader();
        PrintWriter out = new PrintWriter ("teleport.out");
        int a = in.nextInt();
        int b = in.nextInt();
        int x =  in.nextInt();
        int y = in.nextInt ();

        int dist = Math.abs(a - b);

        int tp = Math.min((Math.abs(a-x) + Math.abs(b-y)),(Math.abs(b-x) + Math.abs(a-y)));
        out.println (Math.min(dist, tp));
        out.close();
    }    
}

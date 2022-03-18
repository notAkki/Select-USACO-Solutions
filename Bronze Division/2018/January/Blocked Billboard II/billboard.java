import java.io.*;
import java.util.*;
import java.awt.Rectangle;

public class billboard {
    public static void main (String [] args) throws IOException {
        Kattio io = new Kattio ("billboard");

        int a, b, c, d;
        int ans = 0;

        a = io.nextInt ();
        b = io.nextInt ();
        c = io.nextInt ();
        d = io.nextInt ();
        Rectangle lawn = new Rectangle (a, -d, c-a, d-b);

        a = io.nextInt ();
        b = io.nextInt ();
        c = io.nextInt ();
        d = io.nextInt ();
        Rectangle feed = new Rectangle (a, -d, c-a, d-b);

        Rectangle intersection = lawn.intersection (feed);

        if (intersection.isEmpty()){
            io.println (getArea(lawn));
            io.close();
            return;
        }

        if (intersection.getWidth() == lawn.getWidth()){
            ans = Math.max(getArea(lawn) - getArea(intersection), 0);
            if (intersection.y > lawn.x && (intersection.y + intersection.getHeight()) < (lawn.y + lawn.getHeight())) {
                ans = getArea (lawn);
            }
        }
        else if (intersection.getHeight() == lawn.getHeight()){
            ans = Math.max(getArea(lawn) - getArea(intersection), 0);
        }
        else {
            ans = getArea(lawn);
        }
        
        io.println (ans);
        io.close();
    }

    public static int getArea (Rectangle r){
        if (r.isEmpty())
            return 0;
        return (int) (r.getWidth() * r.getHeight());
    }

    static class Kattio extends PrintWriter {
		private BufferedReader r;
		private StringTokenizer st;
	
		// standard input
		public Kattio() { this(System.in, System.out); }
		public Kattio(InputStream i, OutputStream o) {
			super(o);
			r = new BufferedReader(new InputStreamReader(i));
		}
		// USACO-style file input
		public Kattio(String problemName) throws IOException {
			super(new FileWriter(problemName + ".out"));
			r = new BufferedReader(new FileReader(problemName + ".in"));
		}
	
		// returns null if no more input
		public String next() {
			try {
				while (st == null || !st.hasMoreTokens())
					st = new StringTokenizer(r.readLine());
				return st.nextToken();
			} catch (Exception e) { }
			return null;
		}
	
		public int nextInt() { return Integer.parseInt(next()); }
		public double nextDouble() { return Double.parseDouble(next()); }
		public long nextLong() { return Long.parseLong(next()); }
	}
}

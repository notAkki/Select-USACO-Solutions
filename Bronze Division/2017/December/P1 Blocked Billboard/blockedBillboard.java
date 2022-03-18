import java.util.*;
import java.io.*;
import java.awt.Rectangle;

public class blockedBillboard {
    public static void main (String [] args) throws IOException {
        Kattio io = new Kattio ("billboard");

        int a, b, c, d;

        a =io.nextInt();
        b = io.nextInt();
        c = io.nextInt();
        d = io.nextInt();
        Rectangle first = new Rectangle (a, -d, c - a, d - b);

        a =io.nextInt();
        b = io.nextInt();
        c = io.nextInt();
        d = io.nextInt();
        Rectangle second = new Rectangle (a, -d, c - a, d - b);

        a =io.nextInt();
        b = io.nextInt();
        c = io.nextInt();
        d = io.nextInt();
        Rectangle truck = new Rectangle (a, -d, c - a, d - b);

        int intersection1 = getArea(first.intersection(truck));
        int intersection2 = getArea (second.intersection(truck));

        io.println (getArea(first) + getArea(second) - intersection1 - intersection2);
        io.close();
    }

    public static int getArea (Rectangle rect){
        if (rect.isEmpty()){
            return 0;
        }
        return (int) (rect.getWidth() * rect.getHeight());
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

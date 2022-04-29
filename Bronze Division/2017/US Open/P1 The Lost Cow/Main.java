import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader (new FileReader ("lostcow.in"));
        PrintWriter out = new PrintWriter (new FileWriter ("lostcow.out"));
        StringTokenizer st = new StringTokenizer (in.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int total = 0;
        int last = 0;

        for (int i = 0; i < 9000; i ++){
            int cur = (int) Math.pow (2, i);
            total += last;
            total += cur;
            last = cur;
            if (i%2 == 0){
                if (x + cur >= y && y >= x){
                    total -= (x+cur)-y;
                    break;
                }
            }
            else {
                if (x - cur <= y && y <= x){
                    total -= y-(x-cur);
                    break;
                }
            }
        }
        
        out.println (total);
        out.close();
    }
}

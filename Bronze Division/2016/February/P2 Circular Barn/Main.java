import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {      
		BufferedReader in = new BufferedReader (new FileReader ("cbarn.in"));
        PrintWriter out = new PrintWriter (new FileWriter ("cbarn.out"));
		StringTokenizer st = new StringTokenizer (in.readLine());
        int n = Integer.parseInt(st.nextToken());

		int total = 0;
		int [] arr = new int [n];
		for (int i = 0; i < n; i ++){
			st = new StringTokenizer (in.readLine());
        	int a = Integer.parseInt(st.nextToken());
			arr[i] = a;
			total += a;
		}

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < n; i ++){
			int tempTotal = total - arr[i];
			int cur = 0;

			for (int j = 1; j < n; j ++){
				int index = (i+j)%(n);
				cur += (tempTotal);
				tempTotal -= arr[index];
			}
			if (cur < min){
				min = cur;
			}
		}

		out.println (min);
		out.close();
   }
}

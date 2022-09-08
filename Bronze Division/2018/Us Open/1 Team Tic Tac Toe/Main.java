import java.util.*;
import java.io.*;

public class Main {

	static boolean [][] arr = new boolean [26][26];

	public static void main(String[] args) throws IOException {      
		BufferedReader in = new BufferedReader (new FileReader ("tttt.in"));
        PrintWriter out = new PrintWriter (new FileWriter ("tttt.out"));
		// StringTokenizer st = new StringTokenizer (in.readLine());
        // int n = Integer.parseInt(st.nextToken());
		String first = in.readLine();
		String second = in.readLine();
		String third = in.readLine();
		

		char a =first.charAt(0);
		char b =first.charAt(1);
		char c =first.charAt(2);
		char d =second.charAt(0);
		char e =second.charAt(1);
		char f =second.charAt(2);
		char g =third.charAt(0);
		char h =third.charAt(1);
		char i =third.charAt(2);

		solve (a, b, c);
		solve (d, e, f);
		solve (g, h, i);

		solve (a, d, g);
		solve (b, e, h);
		solve (c, f, i);

		solve (a, e, i);
		solve (g, e, c);

		int solo = 0;
		int duo = 0;

		for (int l = 0; l < 26; l ++){
			for (int j = 0; j < 26; j ++){
				if (l==j && arr[l][j] == true){
					solo++;
				}
				else if (arr[l][j] == true){
					duo ++;
				}
			}
		}

		duo /= 2;

		out.println (solo);
		out.println (duo);
		out.close();
   }

	public static void solve (int a, int b, int c){
		if (a==b || a==c || b==c){
			if (a==b && b==c){
				arr[a-65][a-65] = true;
				return;
			}
			else {
				if (a==b){
					arr[a-65][c-65] = true;;
					arr[c-65][a-65] = true;
					return;
				}
				if (a==c){
					arr[a-65][b-65] = true;
					arr[b-65][a-65] = true;
					return;
				}
				if (b==c){
					arr[b-65][a-65] = true;
					arr[a-65][b-65] = true;
				}
			}
		}
	}

}

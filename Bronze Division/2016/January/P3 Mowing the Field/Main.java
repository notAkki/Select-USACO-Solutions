import java.util.*;
import java.io.*;

public class Main {

	public static class Pair<K, V> {
		public K first;
		public V second;

		public Pair(K first_value, V second_value) {
			first = first_value;
			second = second_value;
		}

		public boolean compareTo (Pair<K,V> p){
			if (p.first.equals(first) && p.second.equals(second))
				return true;
			return false;
		}
	}

	public static LinkedHashMap <String, Integer> map = new LinkedHashMap <String,Integer>();
	static int x = 0;
	static int y = 0;
	static int time = 0;
	
	static int checker = Integer.MAX_VALUE;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {      
		BufferedReader in = new BufferedReader (new FileReader ("mowing.in"));
        PrintWriter out = new PrintWriter (new FileWriter ("mowing.out"));
	    StringTokenizer st = new StringTokenizer (in.readLine());
        int n = Integer.parseInt(st.nextToken());

		map.put (x+ " " + y,0);

		for (int i = 0; i < n; i ++){
	    	st = new StringTokenizer (in.readLine());
			char direction = st.nextToken().charAt(0);
			int dist = Integer.parseInt (st.nextToken());
			updateMap (direction, dist);
		}

		if (checker == min)
			out.println (-1);
		else {
			out.println (min);
		}
		out.close();
   }
	
	public static void updateMap (char direction, int dist){
		if (direction == 'N'){
			for (int i = 0; i < dist; i ++){
				time ++;
				y ++;
				String temp = x + " " + y;
				if (map.containsKey(temp)){
					if (time-map.get(temp) < min){
						min = time-map.get(temp);
					}
				}
				map.put (temp,time);
			}
		}
		else if (direction == 'E'){
			for (int i = 0; i < dist; i ++){
				time ++;
				x ++;
				String temp = x + " " + y;
				if (map.containsKey(temp)){
					if (time-map.get(temp) < min){
						min = time-map.get(temp);
					}
				}
				map.put (temp,time);
			}
		}
		else if (direction == 'S'){
			for (int i = 0; i < dist; i ++){
				time ++;
				y --;
				String temp = x + " " + y;
				if (map.containsKey(temp)){
					if (time-map.get(temp) < min){
						min = time-map.get(temp);
					}
				}
				map.put (temp,time);
			}
		}
		else if (direction == 'W'){
			for (int i = 0; i < dist; i ++){
				time ++;
				x --;
				String temp = x + " " + y;
				if (map.containsKey(temp)){
					if (time-map.get(temp) < min){
						min = time-map.get(temp);
					}
				}
				map.put (temp,time);
			}
		}
	}
}

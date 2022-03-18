import java.io.*;
import java.util.*;

public class measuringTraffic {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner (new File ("./traffic.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("./traffic.out")));

        int n = in.nextInt();

        String [] types = new String [n];
        int [] first = new int [n];
        int [] second = new int [n];

        for (int i = 0; i < n; i ++){
            in.nextLine();
            types [i] = in.next();
            first [i] = in.nextInt();
            second [i] = in.nextInt();
        }

        int lower = 0; int higher = 0;
        boolean noneFound = false;

        for (int i = n-1; i >= 0; i --){
            String type = types [i];
            int a = first [i];
            int b = second [i];

            if (type.equals ("none") && noneFound == false){
                lower = a; higher = b;
                noneFound = true;
                continue;
            }

            if (noneFound){
                if (type.equals("on")){
                    lower -= b; higher -= a;
                }
                if (type.equals ("off")){
                    lower += a; higher += b;
                }
                if (type.equals ("none")){
                    lower = Math.max (lower, a);
                    higher = Math.min (higher, b);
                }
            }
        }

        out.println (lower + " " + higher);

        lower = 0; higher = 0;
        noneFound = false;
        for (int i = 0; i < n; i ++){
            String type = types [i];
            int a = first [i];
            int b = second [i];

            if (type.equals ("none") && noneFound == false){
                lower = a; higher = b;
                noneFound = true;
                continue;
            }

            if (noneFound){
                if (type.equals("on")){
                    lower += a; higher += b;
                }
                if (type.equals ("off")){
                    lower -= b; higher -= a;
                }
                if (type.equals ("none")){
                    lower = Math.max (lower, a);
                    higher = Math.min (higher, b);
                }
            }
        }

        out.println (lower + " " + higher);
        out.close();
    }
}
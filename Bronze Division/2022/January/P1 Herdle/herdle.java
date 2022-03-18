import java.io.*;
import java.util.*;

public class herdle {
    public static void main (String [] args){
        Scanner in = new Scanner (System.in);

        int [] answer = new int [26];
        int [] guess = new int [26];

        int greens = 0;
        int yellows = 0;

        String a = "";
        String b = "";

        for (int i = 0; i < 3; i ++){
            a += in.nextLine();
        }

        for (int i = 0; i < 3; i ++){
            b += in.nextLine();
        }

        for (int i = 0; i < 9; i ++){
            char cur = a.charAt (i);
            answer [cur - 65] ++;
        }

        for (int i = 0; i < 9; i ++){
            char cur = b.charAt (i);
            guess [cur - 65] ++;
        }

        for (int i = 0 ; i < 9; i ++){
            int x = b.charAt (i);
            if (a.charAt(i) == x){
                greens += 1;
                answer [x - 65] --;
                guess [x - 65] --;
            }
        }

        for (int i = 0 ; i < 26; i ++){
            int x = answer[i];
            int y = guess[i];

            if (x - y < x){
                yellows += Math.min (x, y);
            }
        }

        System.out.println (greens + "\n" + yellows);
    }
}

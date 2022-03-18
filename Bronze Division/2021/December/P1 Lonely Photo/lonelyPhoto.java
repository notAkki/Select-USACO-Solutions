import java.io.*;
import java.util.*;

public class lonelyPhoto {
    public static void main (String [] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(in.readLine()); 
        char [] arr = in.readLine().toCharArray();

        int picCount = 0;
        for (int i = arr.length; i >= 3; i --){
            for(int s = 0; s <= arr.length-i; s++){
                char [] sequence = new char [i];
                System.arraycopy(arr, s, sequence, 0, i);
                String seq = String.valueOf (sequence);
                boolean good = false;
                int numH = 0;
                int numG = 0;
                for (int j = 0; j < seq.length(); j ++){
                    if (seq.indexOf("H") == -1 || seq.indexOf("G")==-1){
                        good = true;
                        break;
                    }
                    if (seq.charAt(j) == 'H')
                        numH ++;
                    
                    if (seq.charAt(j) == 'G')
                        numG ++;
                    
                    if (numH >= 2 && numG >= 2){
                        good = true;
                        break;
                    }
                }

                if (!good)
                    picCount ++;
            }
        }
        System.out.println (picCount);
    }
}

import java.io.*;
import java.util.*;

public class dice {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        
        int n = in.nextInt ();

        for (int i = 0; i < n; i ++){
            int [] a = new int [4];
            int [] b = new int [4];

            for (int j = 0; j < 4; j ++){
                a[j] = in.nextInt ();
            }
            for (int j = 0; j < 4; j ++){
                b[j] = in.nextInt ();
            }

            if (isBigger (a, b) < 0){
                int [] c = a;
                a = b;
                b = c;
            }
            else if (isBigger (a, b) == 0){
                System.out.println ("no");
                return;
            }

            int aBig = 0;
            int bBig = 0;;

            for (int j = 0; j < 4; j ++){
                if (aBig < a[j]){
                    aBig = a[j];
                }
            }
            for (int j = 0; j < 4; j ++){
                if (bBig < b[j]){
                    bBig = b[j];
                }
            }

            if (bBig - aBig < 1){
                System.out.println ("no");
            }
            else {
                System.out.println ("yes");
            }
        }
    }

    public static int isBigger (int [] a, int [] b){
        int sum = 0;
        for (int i = 0; i < 4; i ++){
            int x = a[i];
            for (int j = 0; j < 4; j ++){
                int y = b[j];
                if (x > y){
                    sum ++;
                }
                else if (x < y){
                    sum --;
                }
            }
        }
        return sum;
    }
}
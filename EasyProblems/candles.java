package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class candles {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int i, j, min, candle;
        String str[];
        int a[] = new int[10];
        int flag;
        while (t-- > 0) {
            min = 10;
            flag = 0;
            candle = 0;
            str = br.readLine().trim().split("\\s+");

            for (i = 0; i < 9; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            j = a[0];
            for (i = 0; i < 9; i++) {

                if (a[i] <= min && a[i] == j && flag == 0 && i != 0) {
                    min = a[i];
                    candle = i;
                    flag = 1;
                }
                if (a[i] < min) {
                    min = a[i];
                    candle = i;
                }

            }

            if (candle == 0) {
                i = 10;
                while (min > 0) {
                    i *= 10;
                    min--;
                }
            } else {
                i = candle;
                j = candle;
                while (min > 0) {
                    i += (j * Math.pow(10, min--));
                }
            }
            pw.println(i);
        }
        pw.flush();
    }
}

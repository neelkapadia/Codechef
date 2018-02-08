/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Neel_Kapadia
 */
public class the_ball_and_cups {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, n, c, q, x[], s, e, temp, a;
        String[] str;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            str = br.readLine().split("\\s+");
            n = Integer.parseInt(str[0]);
            c = Integer.parseInt(str[1]);
            q = Integer.parseInt(str[2]);
            x = new int[n];
            c-=1;
            x[c] = 2;
            for (int i = 0; i < q; i++) {
                str = br.readLine().split("\\s+");
                s = Integer.parseInt(str[0]);
                e = Integer.parseInt(str[1]);
                s-=1;
                e-=1;
                if (s <= c && c <= e) {
                    temp = x[c];
                    x[c] = x[e - c + s];
                    x[e - c + s] = temp;
                    c = e - c + s;
                }
                /*for (int j = s - 1; j <= (e + s -2) / 2; j++) {
                 temp = x[j];
                 x[j] = x[a];
                 x[a] = temp;
                 a--;
                 }*/
            }
            for (int j = 0; j < n; j++) {
                if (x[j] == 2) {
                    pw.println(j + 1);
                    break;
                }
            }
        }
        pw.flush();
    }
}

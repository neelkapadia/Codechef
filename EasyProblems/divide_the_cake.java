/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Neel_Kapadia
 */
public class divide_the_cake {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, n;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            if (360 % n == 0) {
                pw.print("y ");
            } else {
                pw.print("n ");
            }
            if (n <= 360) {
                pw.print("y ");
            } else {
                pw.print("n ");
            }
            if (n * (n + 1) / 2 <= 360) {
                pw.print("y");
            } else {
                pw.print("n");
            }
            pw.println();
        }
        pw.flush();
    }

}

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
public class farmer_feb {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, x, y, z;
        t = Integer.parseInt(br.readLine());
        String[] str;
        while (t-- > 0) {
            str = br.readLine().split("\\s+");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            z = x + y;
            if (z % 2 == 0) {
                z++;
            } else {
                z+=2;
            }
            while (!isPrime(z)) {
                z += 2;
            }
            pw.println(z-x-y);
        }
        pw.flush();
    }

    public static boolean isPrime(int x) {
        for (int i = 3; i < x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

}

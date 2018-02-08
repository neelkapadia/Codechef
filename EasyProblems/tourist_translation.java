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
public class tourist_translation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, x;
        char[] m = null;
        String trans, input, my = "", a;
        String[] str;
        str = br.readLine().split("\\s+");
        t = Integer.parseInt(str[0]);
        trans = str[1];
        while (t-- > 0) {
            input = br.readLine();
            a = input.toLowerCase();
            m = a.toCharArray();
            for (int i = 0; i < input.length(); i++) {
                if (m[i] == '_') {
                    m[i] = (char) 32;
                } else if (m[i] != '.' && m[i] != ',' && m[i] != '!' && m[i] != '?') {
                    x = (int) m[i] - 'a';
                    if (Character.isLowerCase(input.charAt(i))) {
                        m[i] = trans.charAt(x);
                    }
                    else{
                        m[i] = Character.toUpperCase(trans.charAt(x));
                    }
                }
            }
            for (int i = 0; i < input.length(); i++) {
                my = my + m[i];
            }
            System.out.println(m);

        }

    }
}

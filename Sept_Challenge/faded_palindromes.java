/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept_Challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Neel_Kapadia
 */
public class faded_palindromes {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        String[] str;
        String s;
        int i;
        boolean flag;
        while (t-- > 0) {
            str = br.readLine().split("");
            i = 0;
            flag = true;
            s="";
            while (i < str.length) {
                if (str[i].equals(".") && str[str.length - i - 1].equals(".")) {
                    str[i] = str[str.length - i - 1] = "a";
                } else if (str[i].equals(".")) {
                    str[i] = str[str.length - i - 1];
                }
                i++;
            }
            i = 0;
            while (i < str.length / 2) {
                if (!str[i].equals(str[str.length - i - 1])) {
                    flag = false;
                    break;
                }
                i++;
            }
            if (flag == false) {
                pw.println("-1");
            } else {
                for(i=0;i<str.length;i++)
                    s=s.concat(str[i]);
                pw.println(s);
            }
        }
        pw.flush();
    }
}

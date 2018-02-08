/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept_Challenge;

import java.io.*;

/**
 *
 * @author Neel_Kapadia
 */
public class chef_and_digits_of_a_number {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int i, count0, count1;
        String str;
        while (t-- > 0) {
            str = br.readLine();
            count0 = count1 = 0;
            for (i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '0') {
                    count0++;
                } else {
                    count1++;
                }
            }
            if(count0==1||count1==1){
                pw.println("Yes");
            }
            else{
                pw.println("No");
            }
        }
        pw.flush();
    }
}

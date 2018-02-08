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
public class chef_and_jumps {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        long x;
        int a, flag;
        long n = Long.parseLong(br.readLine());
        flag = 0;
        a = 1;
        x = 0;
        while (x < n) {
            /*if (x == n) {
                flag = 1;
            }
            if (a == 4) {
                a = 1;
            }
            x += a;
            a++; */
            x+=6;
        }
        if(x==n || x-5==n || x-3 == n){
            pw.println("yes");
        } else {
            pw.println("no");
        }
        pw.flush();
    }
}
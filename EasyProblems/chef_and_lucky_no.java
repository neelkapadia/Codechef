/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class chef_and_lucky_no {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int m,n,t,flag;
        t=Integer.parseInt(br.readLine());
        while(t-- >0){
            n=Integer.parseInt(br.readLine());
            m=n*2;
            flag=0;
                for(int i=3;i<n;i++)
                {
                    if(m%i==0){
                        pw.println("Sorry");
                        flag=1;
                        break;  
                    }
                }
                if(flag==0)
                    pw.println("LUCKY NUMBER");
            }
        pw.flush();
    }
}

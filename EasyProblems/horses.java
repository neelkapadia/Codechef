/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyProblems;

/**
 *
 * @author Neel
 */
import java.io.*;
public class horses {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        int S[],i,j,min;
        String[]str;
        while(t-->0){
            int N=Integer.parseInt(br.readLine());
            S=new int[N];
             str=br.readLine().trim().split("\\s+");
            for(i=0;i<N;i++)
               S[i]=Integer.parseInt(str[i]);
            min=Math.abs(S[0]-S[1]);
            for(i=0;i<N;i++){
                for(j=i+1;j<N;j++){
                   if(Math.abs(S[i]-S[j])<=min)
                       min=Math.abs(S[i]-S[j]);
                }
            }
            pw.println(min);
            
        }
        pw.flush();
    }
}

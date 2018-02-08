/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neel_Kapadia
 */
import java.io.*;

public class chefston {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T,N,K,i,profit=0,p,j;
        int [] Ai,Bi;
        String str[];
        T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            str = br.readLine().split("\\s+");
            N = Integer.parseInt(str[0]);
            K = Integer.parseInt(str[1]);
            Ai = new int[N];
            Bi = new int[N];
            str = br.readLine().split("\\s+");
            for(i=0;i<N;i++)
                Ai[i]=Integer.parseInt(str[i]);
            str = br.readLine().split("\\s+");
            for(i=0;i<N;i++)
                Bi[i]=Integer.parseInt(str[i]);
            for(i=0;i<N;i++)
            {
                j=K/Ai[i];
                p = j*Bi[i];
                if(p >= profit)
                    profit=p;
            }
            pw.println(profit);
        }
        pw.flush();
    }
}

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
public class seavec {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int i,j,t = Integer.parseInt(br.readLine());
        String [] str;
        int n,k,x[];
        while(t-->0){
            str = br.readLine().trim().split("\\s+");
            n = Integer.parseInt(str[0]);
            k = Integer.parseInt(str[1]);
            for(i=0;i<n;i++)
            {
                str = br.readLine().trim().split("\\s+");
                for(j=0;j<k;j++)
                {
                    
                }
            }
        }
    }
}

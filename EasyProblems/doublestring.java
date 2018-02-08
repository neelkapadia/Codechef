package EasyProblems;

import java.io.*;
public class doublestring {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int t=Integer.parseInt(br.readLine());
        double n;
        for(int i=0;i<t;i++){
            n=Double.parseDouble(br.readLine());
            if(n%2==0)
                System.out.printf("%.0f",n);
            else
                System.out.printf("%.0f",n-1);
            System.out.println();
        }
    }
    
}

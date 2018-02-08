package EasyProblems;

import java.io.*;
public class smallfactorial {
    public static void main(String[] args) throws Exception{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int num,j;
        double fact,c;
        int a[]=new int[200];
        num=Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++)
        {
            fact=Double.parseDouble(br.readLine());
            c=fact;
            while(c!=1)
                fact*=--c;
            j=0;
           // System.out.printf("%.0f",fact);
            while(fact/10>=1)
            {
                a[j]=(int)(fact%10);
                fact/=10;
                j++;
            }    
            a[j++]=(int)fact%10;
            for(int k=j-1;k>=0;k--)
                System.out.print(a[k]);
            System.out.println();
	}
	
}
}
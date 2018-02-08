package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 public class intest {
public static void main(String[] args)throws Exception {
	double a,n,k;
        int count=0,i;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        n=Double.parseDouble(br.readLine());
        k=Double.parseDouble(br.readLine());
	for(i=0;i<n;i++)
	{
	a=Double.parseDouble(br.readLine());
		
		if(a%k==0)
			count++;	
	}
	System.out.println(count);
}
}
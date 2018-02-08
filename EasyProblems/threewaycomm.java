package EasyProblems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 


class threewaycomm
{
	
		
public static void main(String args[])throws NumberFormatException, IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	PrintWriter out=new PrintWriter(System.out);
	 
	int t=Integer.parseInt(br.readLine());
        int r;
        double d1,d2,d3;
        String s[];
        int x1,x2,y1,y2,x3,y3;
	while(t-->0)
	{
		r=Integer.parseInt(br.readLine());
		
		s=br.readLine().trim().split(" ");
		x1=Integer.parseInt(s[0]);
		y1=Integer.parseInt(s[1]);
		s=br.readLine().trim().split(" ");
		x2=Integer.parseInt(s[0]);
		y2=Integer.parseInt(s[1]);
		s=br.readLine().trim().split(" ");
		x3=Integer.parseInt(s[0]);
		y3=Integer.parseInt(s[1]);
		
            d1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
	    d2 = Math.sqrt(Math.pow(x3- x2, 2) + Math.pow(y3-y2, 2));
	    d3 = Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3 - y1, 2));		
		 
		    if(d1 <= r && d2 <= r || d2 <= r && d3 <= r || d3 <= r && d1 <= r)
		        out.println("yes");
		    else
		       out.println("no");
	}

}
}
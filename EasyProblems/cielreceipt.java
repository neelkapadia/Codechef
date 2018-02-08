package EasyProblems;


import java.io.*;

class cielreceipt {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n, i, count = 0;
      
        while (t-- != 0) {
            n = Integer.parseInt(br.readLine());
            	
		while(n!=0)
		{
			//System.out.println(no);
			for(i=11; i>=0; i--)
			{
				//System.out.println(i);
				if(n>=Math.pow(2, i))
				{
					count++;
					n=n-(int)Math.pow(2, i);
					break;
				}
			}
		}
            System.out.println(count);
            count = 0;
        }

    }
}


package EasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class buyingsweets {
    public static void main(String[] args) throws IOException {
        short t;
        int n,x,i,arr[],sum,flag;
        String str[];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        t = (short)Integer.parseInt(br.readLine());
        while(t-->0){
            sum=0;
            flag=0;
            str=br.readLine().trim().split("\\s+");
            n=Integer.parseInt(str[0]);
            x=Integer.parseInt(str[1]);
            str=br.readLine().trim().split("\\s+");
            arr=new int[n];
            for(i=0;i<n;i++){
                arr[i]=Integer.parseInt(str[i]);
                sum+=arr[i];
            }
            int j=sum%x;
            for(i=0;i<n;i++){
                if(arr[i]<=j){
                    pw.println("-1");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                pw.println(sum/x);
        }
        pw.flush();
    }
    
}

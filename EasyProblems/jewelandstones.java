
package EasyProblems;
import java.io.*;
public class jewelandstones {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t,count;
        t=Integer.parseInt(br.readLine());
        String J,S;
        char []j;
        char []s;
        while(t-- > 0){
            count=0;
            J=br.readLine();
            S=br.readLine();
            j=J.toCharArray();
            s=S.toCharArray();
            for(int k=0;k<s.length;k++){
                for(int i=0;i<j.length;i++){
                    if(s[k]==j[i]){
                        count++;
                        break;
                    }
                }
            }
            pw.println(count);
        }
        pw.flush();
    }
    
}

package EasyProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class buy1get1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int i, j, count, cost;
        char x,arr[];
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            count = 0;
            cost = 0;
            String s = br.readLine();
            arr = s.toCharArray();
            for (i = 0; i < s.length(); i++) {
                x=arr[i];
                for (j = 0; j < s.length(); j++) {
                    if (x == arr[j] && x != '*') {
                        count++;
                        arr[j] = '*';
                    }
                }
                if(count%2!=0)
                    count++;
                cost=count/2;
                }
                count=0; 
            
            pw.println(cost);

        }
        pw.flush();
    }
}

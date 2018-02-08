package EasyProblems;
import java.io.*;
public class littleelephantandpermutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T,N;
        int arr[],i,count,count1;
        String str[];
        T=Integer.parseInt(br.readLine()); 
        while(T-->0){
            count=count1=0;
            N=Integer.parseInt(br.readLine()); 
            str=br.readLine().trim().split("\\s");
            arr=new int[N];
            for(i=0;i<N;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            for(i=0;i<N-1;i++)
                if(arr[i]>arr[i+1])
                    count++;
            for(i=0;i<N-1;i++){
                for(int j=i+1;j<N;j++){
                    if(arr[i]>arr[j])
                        count1++;
                }
            }
            if(count==count1)
                pw.println("YES");
            else
                pw.println("NO");
            
        }
        pw.flush();
    }
}

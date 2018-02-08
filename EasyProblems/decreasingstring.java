package EasyProblems;
import java.io.*;

public class decreasingstring {
    public static void main(String[] args) throws IOException {
        int T,N,i,x,m,j,k,l;
        char[]a;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T=Integer.parseInt(br.readLine());
        while(T-->0){
            N=Integer.parseInt(br.readLine());
            a=new char[N+2];
            j=0;
            m=0;
            l=0;
            if(N>78){
                j=N-78;
                m=3;
            }
            else if(N>52){
                j=N-52;
                m=2;
            }
            else if(N>26){
                j=N-26;
                m=1;
            }
            else{
                j=N;
                m=0;
            }
            for(k=0;k<=m;k++){
            for(i=0;i<j;i++){  
                x='a'+j-i-1;
                a[l++]=(char)x;
            }
            j=26;
            }
            
            for(i=0;i<=N;i++)
                System.out.print(a[i]);
            System.out.println("");
        }
        
        
    }
}

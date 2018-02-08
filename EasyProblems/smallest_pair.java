package EasyProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class smallest_pair {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, i,arr[], n,min,min1,k;
        String str[];
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            str = br.readLine().trim().split("\\s+");
            for(i=0;i<n;i++)
                arr[i]= Integer.parseInt(str[i]);
            min=min1=arr[0];
            k=0;
            for(i=0;i<n;i++){
                if(min>arr[i]){
                    min=arr[i];
                    k=i;
                }
            }
            for(i=0;i<n;i++){
                if(min1>arr[i]&&i!=k)
                    min1=arr[i];
                }
            min+=min1;
            pw.println(min);
            }
        pw.flush();
            

        }
    }


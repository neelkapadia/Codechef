package EasyProblems;
import java.io.*;
public class permutationcycle {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        int flag[] = new int[n];
        int i, temp = 0, j = 0;
        String str[] = br.readLine().split("\\s+");
        for (i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        for(i=0;i<n;i++){
            if(arr[i]!=0){
            temp=arr[i];
            j=i;
            System.out.print(i+1);
            while(j!=temp){
                j=arr[j]-1;
                System.out.print(j);
            }
                System.out.println();
            }
        }
    }
}

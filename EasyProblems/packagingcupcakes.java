package EasyProblems;

import java.io.*;
public class packagingcupcakes {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        double n;
        while(t-- !=0){
            n=Double.parseDouble(br.readLine());
            n=((int)n)/2;
            n+=1;
            System.out.printf("%.0f",n);
            System.out.println();
        }
    }
}

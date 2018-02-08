package MarchChallenge;

import java.io.*;

public class ChefAndNotebook {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pages, current, money, books, i, p;
        int pg,price,flag;
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            flag=0;
            pages =  Integer.parseInt(br.readLine());
            current = Integer.parseInt(br.readLine());
            money  = Integer.parseInt(br.readLine());
            books  = Integer.parseInt(br.readLine());
            p=pages-current;
            for(i=0;i<books;i++)
            {
                pg= Integer.parseInt(br.readLine());
                price= Integer.parseInt(br.readLine());
                if(pg>=p&&price<=money)
                    flag=1;
            }
            if(flag==0)
                System.out.println("UnluckyChef");
            else
                System.out.println("LuckyChef");
            
        }
    }
}

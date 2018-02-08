package EasyProblems;

import java.util.Scanner;
public class yetanothernumbergame {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i,n,count=0,x=0;
        for(i=0;i<t;i++)
        {
            n=sc.nextInt();
            while(n>0){
                if(n%2==0){
                    n/=2;
                     count++;
                }
                else if(n%2!=0){
                    for(int j=3;j<=n/3;j++)
                        if(n%j==0)
                            x=j;
                    n=n-x;
                    if(x!=0&&n!=0)
                        count++;
                    else 
                        break;
                }               
            }
            
            if(count%2==0||count==0)
                System.out.println("BOB");
            else
                System.out.println("ALICE");
            count=0;
            x=0;
        }
    }
}

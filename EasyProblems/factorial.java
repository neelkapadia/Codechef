package EasyProblems;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;double fact,c;
        num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            fact=sc.nextDouble();
            c=fact;
            while(c!=1)
                fact*=--c;
            c=0;
            while(fact%10==0)
            {
               c++;
               fact=fact/10;
            }
            System.out.printf("%.0f",c);
            System.out.println();
        }        
    }
}

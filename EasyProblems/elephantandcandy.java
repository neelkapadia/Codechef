package EasyProblems;

import java.util.Scanner;
public class elephantandcandy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int i,N,A[];
        double count;
        double C;
        while(t-->0){
            count=0;
            N=sc.nextInt();
            A=new int[N];
            C=sc.nextDouble();
            for(i=0;i<N;i++)
                A[i]=sc.nextInt();
            for(i=0;i<N;i++)
                count+=A[i];
            if(count<=C)
                System.out.println("Yes");
            else
                System.out.println("No");
            
        }
    }
}


package MarchChallenge;
import java.util.Scanner;
public class chefandproblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N,M,K;
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();
        int growth[]=new int[N];
        int i,j,L,R,count;
        for(i=0;i<N;i++)
            growth[i]=sc.nextInt();
        while(K-->0){
            count=0;
            L=sc.nextInt();
            R=sc.nextInt();
            for(i=L-1;i<R;i++){
                for(j=i+1;j<R;j++){
                    if(growth[i]==growth[j]){
                        if(count<j-i)
                            count=j-i;
                            if(count==R-L)
                                break;
                    
                    }
                }
            }
            System.out.println(count);
        }
        
        
    }
 
}

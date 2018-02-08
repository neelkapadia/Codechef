package EasyProblems;

import java.util.Scanner;
public class ambiguous {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,a,flag=1;
        
        while(n!=0){
            int arr[]=new int[n];
            for(i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(i=0;i<n;i++){
                a=arr[i];
                if(i+1!=arr[a-1]){
                    System.out.println("not ambiguous");
                    flag=0;
                    break;
                }
            }
            if(flag==1)
                System.out.println("ambiguous");
            n=sc.nextInt();
            flag=1;
        }
    }
}

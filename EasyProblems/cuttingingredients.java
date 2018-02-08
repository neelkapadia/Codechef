package EasyProblems;


import java.util.Scanner;

public class cuttingingredients {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, min, arr[], j, i,temp, flag = 0;
        while (t-- > 0) {
            min = 1001;
            temp=1;
            
            n = sc.nextInt();
            arr = new int[n];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            for (i = min; i >=2; i--) {
                for (j = 0; j < n; j++) {
                    if (arr[j] % i != 0) {
                        flag = 1;
                    }
                }
                
                if(flag==0){
                    temp=i;
                    break;
                }
                flag=0;
            }
            for(i=0;i<n;i++)
            {
                arr[i]/=temp;
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
}

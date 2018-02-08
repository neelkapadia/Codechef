package EasyProblems;


import java.util.Scanner;

public class countofmax {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        int x , maxcount , j, count , n, i, arr[];
        while (t-- != 0) {
            count=0;
            maxcount=0;
            x=0;
            n = sc.nextInt();
            arr = new int[n+1];
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (i = 0; i < n; i++) {
                for (j = 0; j < n; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count > maxcount) {
                    maxcount = count;
                    x = arr[i];
                } 
                else if (count == maxcount) {
                    if (arr[i] < x) {
                        x = arr[i];
                    }

                }
                count=0;
            }
            System.out.print(x+" ");
            System.out.println(maxcount);
            
        }

    }
}

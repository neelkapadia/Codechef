package EasyProblems;


import java.util.Scanner;

public class cleaningup {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int total, done, i, j, temp, arr[];
        while (t-- > 0) {
            total = sc.nextInt();
            done = sc.nextInt();
            arr = new int[total];
            for (i = 0; i < total; i++) {
                arr[i] = i + 1;
            }
            for (i = 0; i < done; i++) {
                temp = sc.nextInt();
                arr[temp-1] = -1;
            }
            j = 0;
            done = 0;
            for (i = 0; i < total; i++) {
                if (arr[i] != -1) {
                    arr[j++] = arr[i];
                    done++;
                }
            }
            for(i=0;i<done;i+=2)
                System.out.print(arr[i]+" ");
            System.out.println();
            for(i=1;i<done;i+=2)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}

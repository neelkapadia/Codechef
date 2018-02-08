package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;

public class lapindromes {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        String str;
        int x;
        char a[];
        
        int len, i, j;
        while (t-- > 0) {
            str = br.readLine();
            str = str.toUpperCase();
            a = str.toCharArray();
            len = a.length;
            int arr[] = new int[26];
            int arr1[] = new int[26];
            if (len % 2 == 0) {
                for (i = 0; i < len / 2; i++) {
                    x = (int) a[i];
                    arr[x - 65]++;
                }
                for (i = len - 1; i >= len / 2; i--) {
                    x = (int) a[i];
                    arr1[x - 65]++;
                }
            } else {
                for (i = 0; i < len / 2; i++) {
                    x = (int) a[i];
                    arr[x - 65]++;
                }
                for (i = len - 1; i > len / 2; i--) {
                    x = (int) a[i];
                    arr1[x - 65]++;
                }
            }
            x = 0;
            for (i = 0; i < 26; i++) {
                if (arr[i] != arr1[i]) {
                    System.out.println("NO");
                    x = 1;
                    break;
                }
            }
            if(x==0)
                System.out.println("YES");

        }
    }
}

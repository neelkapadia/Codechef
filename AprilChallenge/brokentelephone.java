package AprilChallenge;

import java.io.*;

public class brokentelephone {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int n, i, count, j;
        int arr[];
        String[] str;
        while (t-- > 0) {
            count = 0;
            j = 0;
            n = Integer.parseInt(br.readLine());
            arr = new int[n];
            str = br.readLine().split("\\s+");
            for (i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            for (i = 1; i < n; i++) {
                j = i - 1;
                if (arr[i] != arr[i - 1]) {
                    if (arr[i] == arr[j]) {
                        count += 1;
                    } else {
                        count += 2;
                    }
                }
            }
            pw.println(count);
        }
        pw.flush();
    }
}

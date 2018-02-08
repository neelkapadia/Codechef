package EasyProblems;
import java.io.*;

public class coinflip {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[] str;
        int g, i, n, q, count;
        while (t-- > 0 ) {
            g = Integer.parseInt(br.readLine());
            while (g-- > 0) {
                count = 0;
                str = br.readLine().split("\\s+");
                i = Integer.parseInt(str[0]);
                n = Integer.parseInt(str[1]);
                q = Integer.parseInt(str[2]);
                for (int j = 0; j < n; j++) {
                    if ((n - j) % 2 == 0) {
                        count++;
                    }
                }
                if (i == 1) {
                    if (q == 1) {
                        System.out.println(count);
                    } else {
                        System.out.println(n - count);
                    }
                } else {
                    if (q == 2) {
                        System.out.println(count);
                    } else {
                        System.out.println(n - count);
                    }
                }
            }
        }
    }
}
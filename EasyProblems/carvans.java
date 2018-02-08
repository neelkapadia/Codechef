package EasyProblems;

import java.io.*;

public class carvans {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        int N, speed[], i, count;
        String str[];
        while (T-- > 0) {
            count =1;
            N = Integer.parseInt(br.readLine());
            speed = new int[N];
            str = br.readLine().trim().split("\\s+");
            for (i = 0; i < N; i++) {
                speed[i] = Integer.parseInt(str[i]);
            }
            for (i = 1; i < N; i++) {
                if (speed[i] <= speed[i - 1]) {
                    count++;
                } else {
                    speed[i] = speed[i - 1];
                }
            }
            pw.println(count);
        }
        pw.flush();
    }
}

package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class gcd2 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int x, y, j;
        String str[];
        while (t-- > 0) {
            str = br.readLine().trim().split("\\s+");
            x = Integer.parseInt(str[0]);
            y = Integer.parseInt(str[1]);
            if (x == y) {
                System.out.println(x);
            }
            if (x < y) {
                j = x;
                while (j >= 1) {
                    if (x % j == 0 && y % j == 0) {
                        System.out.println(j);
                        break;
                    }
                    j--;
                }
            }
            if (x > y) {
                j = y;
                while (j >= 1) {
                    if (x % j == 0 && y % j == 0) {
                        System.out.println(j);
                        break;
                    }
                    j--;
                }
            }
        }
    }

}

package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class unclejohny {

    public static void quicksort(int x[], int lb, int ub) {
        int i, j, key, temp;
        if (lb < ub) {
            i = lb;
            j = ub;
            key = x[lb];
            while (i < j) {
                i++;
                while (i <= ub && x[i] < key) {
                    i++;
                }
                while (j > -lb && x[j] > key) {
                    j--;
                }
                if (i < j) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
            temp = x[j];
            x[j] = x[lb];
            x[lb] = temp;

            quicksort(x, lb, j - 1);
            quicksort(x, j + 1, ub);
        }
    }

    public static void main(String args[]) throws Exception {
        int a[], i, n, t, x;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            n = Integer.parseInt(br.readLine());
            a = new int[n];
            String str[];
            str = br.readLine().trim().split("\\s+");
            for (i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            x = Integer.parseInt(br.readLine());
            x = a[x - 1];
            quicksort(a, 0, n - 1);
            for (i = 0; i < n; i++) {
                if (a[i] == x) {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}

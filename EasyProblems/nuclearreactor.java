package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class nuclearreactor {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String s[]=str.trim().split("\\s+");
        double a=Double.parseDouble(s[0]);
        int n=Integer.parseInt(s[1]);
        int k=Integer.parseInt(s[2]);
        int arr[] = new int[k];
        int j = 0;
        while (a > 0) {
            if (arr[j] < n) {
                arr[j]++;
                a--;
                j = 0;
            }
            if (arr[j] == n) {
                arr[j] = 0;
                j++;
            }
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

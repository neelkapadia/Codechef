package EasyProblems;


import java.io.*;
import java.util.Arrays;

public class primepalindorme {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c;
            int n = Integer.parseInt(br.readLine());
             while(ispalindrome(n)==0 || isprime(n)==0)
                            n++;
    System.out.println(n);
    }
    

    static int isprime(int x) {
        int i;
        for (i = 2; i < x / 2; i++) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    static int ispalindrome(int x) {
        int temp = 0;
        int c = x;
        while (c > 0) {
            temp = temp * 10 + (c % 10);
            c /= 10;
        }
        if (temp == x) {
            return 1;
        } else {
            return 0;
        }
    }
}

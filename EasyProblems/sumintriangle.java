package EasyProblems;


import java.util.Scanner;

public class sumintriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, j, k, s, sum = 0;
        for (i = 0; i < t; i++) {
            s = sc.nextInt();
            int arr[][] = new int[s][s];
            for (j = 0; j < s; j++) {
                for (k = 0; k <= j; k++) {
                    arr[j][k] = sc.nextInt();
                }
            }
            

        }
    }
}

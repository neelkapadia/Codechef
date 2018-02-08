package EasyProblems;


import java.util.Scanner;

public class leadgame {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int i, j, c;
        String str;
        char x[] = new char[20];
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (i = 0; i < n; i++) {
            for (j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int play = 0, temp;

        for (i = 0; i < n; i++) {
            if (i > 0) {
                arr[i][0] += arr[i - 1][0];
                arr[i][1] += arr[i - 1][1];
            }
            temp = arr[i][0] - arr[i][1];
            if (temp < 0) {
                temp *= (-1);
                c = 2;
            } else {
                c = 1;
            }
            if (temp > max) {
                max = temp;
                play = c;
            }
        }
        System.out.print(play + " " + max);
    }
}

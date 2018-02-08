package EasyProblems;


import java.util.Scanner;

public class cielsubtraction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, diff;
        A = sc.nextInt();
        B = sc.nextInt();
        diff = A - B;

        if (diff % 10 == 0) {
            if (B % 10 != 1) {
                diff++;
            } else {
                diff += 2;
            }
        } else {
            diff--;
        }
        if (diff == 0) {
            System.out.println(2);
        } else {
            System.out.println(diff);
        }

    }
}

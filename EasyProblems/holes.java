package EasyProblems;


import java.util.Scanner;

public class holes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String str;
        char x;
        int count;
        for (int i = 0; i < t; i++) {
            count=0;
            str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                x = str.charAt(j);
                if (x == 'B') {
                    count += 2;
                } else if (x == 'A' || x == 'D' || x == 'O' || x == 'P' || x == 'Q' || x == 'R') {
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}

package EasyProblems;


import java.util.Scanner;

public class cookingpies {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i, n, j, k = 0, min, min1, count = 0,d=0,c=0;
        while (t-- != 0) {
            n = sc.nextInt();
            int pie[] = new int[n];
            int weight[] = new int[n];
            for (j = 0; j < n; j++) {
                pie[j] = sc.nextInt();
            }
            for (j = 0; j < n; j++) {
                weight[j] = sc.nextInt();
            }
            for (j = 0; j < n; j++) {
                min = 2000;
                min1 = 2000;
                for (k = 0; k < n; k++) {
                    if (weight[k] < min) {
                        min = weight[k];
                        c=k;
                    }
                    if (pie[k] < min1) {
                        min1 = pie[k];
                        d=k;
                    }
                    
                    
                }
                if (min >= min1) {
                    count++;
                    pie[d]=200;
                }
                weight[c]=200;
                
            }
            System.out.println(count);
            count=0;
        }
    }

}

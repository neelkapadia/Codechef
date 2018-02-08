package EasyProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class voterslist {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String str[] = br.readLine().trim().split("\\s+");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(str[2]);
        int i = 0;
        int a1[] = new int[a + b + c];
        for (i = 0; i < a + b + c; i++) {
            a1[i] = Integer.parseInt(br.readLine());
        }
        int ans[] = new int[a + b + c];
        Arrays.sort(a1);

        int j = 0;
        int index = 0;
        int count = 0;
        for (i = 0; i < a1.length - 1; i = j) {
            int counter = 1;
            for (j = i + 1; j < a1.length; j++) {
                if (a1[j] != a1[i]) {
                    break;
                }
                counter++;
            }
            if (counter >= 2) {
                ans[index++] = a1[i];
                count++;
            }
        }
        System.out.println(count);
        for(i=0;i<ans.length;i++){
            if(ans[i]!=0)
                System.out.println(ans[i]);
            else
                break;
        }

    }

}

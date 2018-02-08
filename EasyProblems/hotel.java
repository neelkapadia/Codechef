package EasyProblems;

import java.io.*;

public class hotel {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t, number, i, min, count;
        int arrive[], depart[];
        String a[], b[];
        t =Integer.parseInt(br.readLine()); 
        while (t-- > 0) {
            number = Integer.parseInt(br.readLine());
            a = br.readLine().trim().split("\\s");
            b = br.readLine().trim().split("\\s");
            arrive = new int[number];
            depart = new int[number];
            for (i = 0; i < number; i++) {
                arrive[i] = Integer.parseInt(a[i]);
                depart[i] = Integer.parseInt(b[i]);
            }
            int count1=0;
            for (int j = 0; j < number; j++) {
                            count = 0;
                for (i = 0; i < number; i++) {
                    if (depart[i] > depart[j] && arrive[i] <= depart[j]) {
                        count++;
                    }
                }
                if(count>count1)
                count1=count;
            }
                pw.println(count1);
        }
        pw.flush();
    }
}

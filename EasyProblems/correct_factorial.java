package EasyProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class correct_factorial {
    static BufferedReader buffReader = new BufferedReader(
            new InputStreamReader(System.in));
    
    public static void main(String[] args) throws Exception {
        int T = Integer.parseInt(buffReader.readLine());
 
        while (T-- > 0) {
            int N = Integer.parseInt(buffReader.readLine());
 
            int count = 0;
            while (N > 0) {
                count += (N = N / 5);
                //System.out.println(count);
            }
 
            System.out.println(count);
        }

    }
} 
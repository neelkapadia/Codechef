/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EasyProblems;

/**
 *
 * @author Neel
 */
import java.io.*;

public class submitted_nuclearreactor {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = in.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int n = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        n++;
        int[] ar = new int[k];
        while (k > 0) {
            System.out.print(a % n + " ");
            a /= n;
            k--;
        }
    }
}

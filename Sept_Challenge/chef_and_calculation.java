/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sept_Challenge;

import java.util.HashSet;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Neel_Kapadia
 */
public class chef_and_calculation {

    public void printDistinct(int arr[]) {
        // Creates an empty hashset
        HashSet<Integer> set = new HashSet<>();

        // Traverse the input array
        for (int i = 0; i < arr.length; i++) {
            // If not present, then put it in hashtable and print it
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int players, i, j, count, score[], index, temp, arr[] = new int[6];
        String str[];
        while (t-- > 0) {
            players = Integer.parseInt(br.readLine());
            score=new int[players];
            for (i = 0; i < players; i++) {
                str = br.readLine().split("\\+");
                Arrays.fill(arr, 0);
                for (j = 1; j < str.length; j++) {
                    if (str[i].equals("1")) {
                        arr[0]++;
                    }
                    if (str[i].equals("2")) {
                        arr[1]++;
                    }
                    if (str[i].equals("3")) {
                        arr[2]++;
                    }
                    if (str[i].equals("4")) {
                        arr[3]++;
                    }
                    if (str[i].equals("5")) {
                        arr[4]++;
                    }
                    if (str[i].equals("6")) {
                        arr[5]++;
                    }
                }
                count = 5;
                temp = str.length - 1;
                while (count <= 6 && count >= 4) {
                    count=0;
                    for (j = 0; j < arr.length; j++) {
                        if (arr[j] != 0) {
                            count++;
                            arr[j]--;
                        }
                    }
                    if(count==6){
                        temp+=4;
                    }
                    if(count==5){
                        temp+=2;
                    }
                    if(count==4){
                        temp+=1;
                    }
                }
                score[i]=temp;
                System.out.println(temp);
            }
        }
    }
}

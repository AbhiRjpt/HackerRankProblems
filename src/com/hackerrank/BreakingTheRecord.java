package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class BreakingTheRecord {
    static int[] breakingRecords(int[] scores) {
        int[] result = new int[2];
        HashMap<String,Integer> kayValMap = new LinkedHashMap<>();
        kayValMap.put("highest",0);
        kayValMap.put("lowest",0);
        int highest = scores[0];
        int lowest = scores[0];
        for(int i =1;i<scores.length;i++){
            if(highest < scores[i]){
                int val = kayValMap.get("highest");
                val++;
                kayValMap.put("highest",val);
                highest = scores[i];
            }

            if(lowest > scores[i]){
                int val = kayValMap.get("lowest");
                val++;
                kayValMap.put("lowest",val);
                lowest = scores[i];
            }
        }
        result[0] = kayValMap.get("highest");
        result[1] = kayValMap.get("lowest");
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] scores = new int[n];
//
//        String[] scoresItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int scoresItem = Integer.parseInt(scoresItems[i]);
//            scores[i] = scoresItem;
//        }
//
//        int[] result = breakingRecords(scores);
//
//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
//        int[] scores = {10,5,20,20,4,5,2,25,1};
        int[] scores = {3,4,21,36,10,28,35,5,24,42};

        int[] result = breakingRecords(scores);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

package com.hackerrank;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class BeautifulString {
    /*
     * Complete the beautifulStrings function below.
     */
    static long beautifulStrings(String s) {
        List<String> beautifulStringList = new LinkedList<>();
        for (int i=0;i<s.length();i++){
            int a = getRandomNumberInRange(0,s.length()-1);
            int b = getRandomNumberInRange(0,s.length()-1);
            if(a == b){
                b = getRandomNumberInRange(0,s.length()-1);
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<s.length();j++){
               if(j != a || j!=b){
                   sb.append(s.charAt(i));
               }
               if(!beautifulStringList.contains(sb.toString())) {
                   beautifulStringList.add(sb.toString());
               }
            }
        }

//       if(s.length()<3){
//           return 2;
//       }
//       String s2 = getStringWithoutSpaces(s);
//        List<String> beautifulStringList = new LinkedList<>();
//        int j =0;
//        int i =0;
//        int k = i;
//
//        while (i<=s2.length()-1 && j<=s2.length()-1){
//            char ch = s2.charAt(j);
//            char ch2 = s2.charAt(s2.length()-1);
//                String s1 = getString(ch, s2.charAt(i));
//                String s3 = getString(ch2,s2.charAt(s2.length()-1-j));
//            if (!beautifulStringList.contains(s1)) {
//                beautifulStringList.add(s1);
//            }
//
//            if (!beautifulStringList.contains(s3)) {
//                beautifulStringList.add(s3);
//            }
//                i++;
//                if(i==s2.length()-1){
//                    if(!beautifulStringList.contains(getString(ch,s2.charAt(i)))) {
//                        beautifulStringList.add(getString(ch, s2.charAt(i)));
//                    }
//                    j++;
//                    i = k+1;
//                }
//        }
//        System.out.println("beautifulString: "+beautifulStringList);
       return beautifulStringList.size();
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static String getStringWithoutSpaces(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String getString(char ch1, char ch2) {
        return ch1+""+ch2;
    }

    private static String revString(char ch1, char ch2) {
        return ch2+""+ch1;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        String s = scanner.nextLine();

        String s = "abbaababbaedbac";
        long result = beautifulStrings(s);
        System.out.println("result: "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
    }
}

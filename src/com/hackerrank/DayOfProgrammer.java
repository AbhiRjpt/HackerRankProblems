package com.hackerrank;

import java.io.IOException;

public class DayOfProgrammer {
    static String dayOfProgrammer(int year) {
        String leapStr = "12.09.";
        String nonLeapStr = "13.09.";

        if(year < 1918){
            if(year%4 == 0){
                return leapStr+year;
            }else {
                return nonLeapStr+year;
            }
        }else {
            if((year%400==0) || ((year%4 == 0) && (year%100 != 0))){
                return leapStr+year;
            }else {
                return nonLeapStr+year;
            }
        }

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int year = Integer.parseInt(bufferedReader.readLine().trim());

        int year = 2017;

        String result = dayOfProgrammer(year);
        System.out.println("result: "+result);

//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

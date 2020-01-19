package com.hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KangrooProblem {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int rem = -1;
        int difX = x2 - x1;
        int difV = v1-v2;

        if(difV>0 && difX>0){
            rem = difX%difV;
        }

        if(rem ==0){
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = Integer.parseInt(x1V1X2V2[0]);

        int v1 = Integer.parseInt(x1V1X2V2[1]);

        int x2 = Integer.parseInt(x1V1X2V2[2]);

        int v2 = Integer.parseInt(x1V1X2V2[3]);

//
//        int x1 = 0;
//
//        int v1 = 3;
//
//        int x2 = 4;
//
//        int v2 = 2;
//        4523 8092 9419 8076
//        1571 4240 9023 4234
//        int x1=4523,v1=8092,x2=9419,v2=8076;
//        int x1=1571,v1=4240,x2=9023,v2=4234;
//        int x1=0,v1=2,x2=5,v2=3;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println("result: "+result);


        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

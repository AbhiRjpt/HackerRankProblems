package com.hackerrank;

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.LinkedList;
import java.util.List;

class TestClass {

      static List<Integer> sumList = new LinkedList<>();
    public static int pairwiseSummation(int[] arr, int start,int st,int rt){
        List<Integer> initCalList = new LinkedList<>();
        int valSum = 1;
        int sum = 0;
        int mul = 1;
        boolean isFirst = true;
        for(int i = rt-1;i>=st-1;i--){
            System.out.println("i: "+i+" ="+arr[i]);
            System.out.println("valSum: "+valSum);
            if(isFirst){
                initCalList.add(arr[i-1]*arr[i]);
                isFirst = false;
                valSum = arr[i-1]+arr[i];
                i--;
            }else{
                // 4,6,2,8,9,2,3,5
                mul = valSum * arr[i];
                System.out.println("mul: "+mul);
                initCalList.add(mul);
                valSum = valSum+arr[i];
            }
            System.out.println("initCalList: "+initCalList);

        }
        System.out.println(initCalList);
        for(int num : initCalList){
            sum = sum+num;
            System.out.println(sum);
        }
        return sum;
    }


    public static void main(String args[] ) throws Exception {

        int x=8,y=8;
        int[] arr = {4,6,2,8,9,2,3,5};
        int start=0,st=1,rt=3;


        int res = pairwiseSummation(arr,start,st,rt);
        sumList.add(res);
        System.out.println("res: "+res);
        System.out.println(sumList);



        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here

    }
}


package com.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicalWorld {
    public void solution(String S,String T){
//        Map<Integer,String> nameIdMap = new HashMap<>();
//        nameIdMap.
        int mulSt = 1;
        for(int i = 0;i<S.length();i++){
             mulSt = mulSt * (((int) S.charAt(i))-64);
        }
        System.out.println(mulSt);
        int mulTec = 1;
        for(int i = 0;i<T.length();i++){
            mulTec = mulTec * (((int) T.charAt(i))-64);
        }
        System.out.println(mulTec);
        if((mulSt%47) == (mulTec%47)){
            System.out.println("CHOSEN");
        }else {
            System.out.println("NOT CHOSEN");
        }

    }
}

// Following is the part of the program and is provided as an assistance to read the input.
class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        MagicalWorld s = new MagicalWorld();
        s.solution(S,T);
    }
}

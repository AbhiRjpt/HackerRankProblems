package com.hackerrank;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BirthdayChocolate {

    static int birthday(List<Integer> s, int d, int m) {
        if(s.size() ==1){
            if((m == 1) && (d==s.get(0))){
                return 1;
            }else {
                return 0;
            }
        }


        int count = 0;

//        int i =0;
//        int r =0;
//      while (i<s.size()){
//          sum +=s.get(i);
//          if((i==m-1)){
//              if(sum == d){
//                  count++;
//              }
//              r++;i=r;i--;m++;sum = 0;
//          }
//          if(m >= s.size()){
//              return count;
//          }
//            i++;
//      }

        for(int i = 0;i<s.size();i++){
            System.out.println("i : "+i);
            int sum = 0;
            for(int j = i;j<m;j++) {
                System.out.println("j : "+j);
                sum = sum + s.get(j);
                System.out.println("sum : "+sum);

                if(sum > d){
                    break;
                }
                System.out.println("count: "+count);
            }
            m++;
            if(sum == d){
                count++;
            }
            System.out.println("---> m : "+m);
            if(m > s.size()){
              return count;
          }


        }

        return count;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> s = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int d = Integer.parseInt(dm[0]);
//
//        int m = Integer.parseInt(dm[1]);
//
        List<Integer> s = new LinkedList<>();
//        s.add(4);

//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(1);



        int d = 18;
        int m = 7;
        int result = birthday(s, d, m);
        System.out.println("result : "+ result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();


    }
}

package com.hackerrank;

import java.io.IOException;
import java.util.*;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {
        if(arr.size()<2){
            return arr.get(0);
        }

        int max = 0;

        Map<Integer,Integer> keyCountMap = new HashMap<>();
        for (int val : arr){
            if(!keyCountMap.containsKey(val)){
                keyCountMap.put(val,1);
//                max = 1;
            }else {
               int count = keyCountMap.get(val);
               count++;
                keyCountMap.put(val,count);
                if(max < count){
                    max = count;
                }
            }
        }
        List<Integer> birdTypeList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> keyCount : keyCountMap.entrySet()){
            if(keyCount.getValue() == max){
                birdTypeList.add(keyCount.getKey());
            }
        }
        System.out.println("max: "+max);
        System.out.println("keyCountMap:{}"+keyCountMap);

        System.out.println("birdTypeListSize: "+birdTypeList.size());
        System.out.println("birdTypeList: "+birdTypeList);
        if(birdTypeList.size()>2){
            return birdTypeList.get(birdTypeList.size()-2);
        }else {
            return birdTypeList.get(0);
        }

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());

        List<Integer> arr  = new LinkedList<>();

        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);

//        arr.add(1);
//        arr.add(2);
//        arr.add(3);
//        arr.add(4);
//        arr.add(5);
//        arr.add(4);
//        arr.add(3);
//        arr.add(2);
//        arr.add(1);
//        arr.add(3);
//        arr.add(4);

        int result = migratoryBirds(arr);
        System.out.println("result: "+result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}

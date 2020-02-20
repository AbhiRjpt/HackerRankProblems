package com.hackerrank;

import java.io.IOException;
import java.util.*;

public class KthElement {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int size = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            int k = sc.nextInt();

            System.out.println(str);
            System.out.println(k);
            List<String> myList = Arrays.asList(str.split(" "));
            System.out.println(myList);
            int result = findKthNumber(myList,k);
            System.out.println(result);
        }
    }

    private static int findKthNumber(List<String> list, int k) {

        boolean isFound = false;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i=0;i<list.size();i++){
            map.put(list.get(i),i);
        }
        Collections.sort(list);
        while(!isFound) {
            isFound = true;
            List<String> loc = new ArrayList<>();
            for (int i=1;i<list.size();i++){
                int diff = Integer.parseInt(list.get(i))-Integer.parseInt(list.get(i-1));
                if(!map.containsKey(diff+"")){
                    if(diff<0){
                        diff = -diff;
                    }
                    System.out.println("diff "+diff);
                    map.put(diff+"",list.size());
                    isFound = false;
                }
            }
            list = new ArrayList<String>(map.keySet());
            Collections.sort(list);
            System.out.println(list);
        }

        if(list.size()>=k){
            return Integer.parseInt(list.get(list.size()-k));
        }

        return -1;
    }
}

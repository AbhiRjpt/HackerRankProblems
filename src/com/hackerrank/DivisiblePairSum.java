package com.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DivisiblePairSum {
    static int divisibleSumPairs(int n, int k, int[] ar) {
//        int count=0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i<j && (ar[i]+ar[j])%k==0){
//                    count++;
//                }
//            }
//        }
//        return count;

        int []freq = new int[k];

        // To store count of pairs.
        int ans = 0;

        // Traverse the array, compute the remainder
        // and add k-remainder value hash count to ans
        for (int i = 0; i < n; i++)
        {
            int rem = ar[i] % k;
            System.out.println("rem: "+rem);
            System.out.println("ans: "+ans);
            if (rem != 0)
                ans += freq[k - rem];
            else
                ans += freq[0];

            // Increment count of remainder in hash map
            freq[rem]++;
        }
//        2, 2, 1, 7, 5, 3
        return ans;
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nk = scanner.nextLine().split(" ");
//
//        int n = Integer.parseInt(nk[0]);
//
//        int k = Integer.parseInt(nk[1]);
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
//
        int[] ar = {2, 2, 1, 7, 5, 3};
        int result = divisibleSumPairs(6, 4, ar);
        System.out.println("result: "+result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}

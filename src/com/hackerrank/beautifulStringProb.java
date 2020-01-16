package com.hackerrank;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class beautifulStringProb {
    /*
     * Complete the beautifulStrings function below.
     */
    static long beautifulStrings(String s) {
        int countA =0,countB=0,countC=0,min,count;
        Count temp;
        Map<Count,Integer> m = new HashMap<Count,Integer>();
        m.put(new Count(0,0,0),1);
        for(char c:s.toCharArray()){
            if(c=='a'){
                countA++;
            }else if(c=='b'){
                countB++;
            }else if(c=='c'){
                countC++;
            }
            min = Math.max(countA,Math.max(countB,countC));
            if(min>0){
                countA-=min;
                countB-=min;
                countC-=min;
            }
            temp= new Count(countA,countB,countC);
            count = m.getOrDefault(temp,0);
            m.put(temp,count+1);
        }
        count=0;
        for(Map.Entry<Count,Integer> entry:m.entrySet()){
            //System.out.println(entry.getValue());
            count+=((entry.getValue()-1)*entry.getValue())/2;
        }
        return count;
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

class Count{
    int countA;
    int countB;
    int countC;
    public Count(int countA,int countB,int countC){
        this.countA=countA;
        this.countB=countB;
        this.countC=countC;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + countA;
        result = prime * result + countB;
        result = prime * result + countC;
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Count)) {
            return false;
        }
        Count other = (Count) obj;
        if (countA != other.countA) {
            return false;
        }
        if (countB != other.countB) {
            return false;
        }
        if (countC != other.countC) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Count [countA=" + countA + ", countB=" + countB + ", countC="
                + countC + "]";
    }
}

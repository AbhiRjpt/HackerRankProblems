package com.hackerrank;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class TimeConversion {
    static String timeConversion(String s) throws ParseException {
        String output = "";
        String hr = "";
        String builderStringConverter="";
        String[] strSplit_array = s.split(":");
        StringBuilder sb = new StringBuilder();
        int hrVal = Integer.parseInt(strSplit_array[0]);
        for(int i =1;i<strSplit_array.length;i++){

            sb.append(":"+strSplit_array[i]);
            System.out.println("arrayValues: "+strSplit_array[i]);
        }
        System.out.println("builder: "+sb.toString());
        builderStringConverter = sb.substring(0,sb.length()-2);

        if(s.contains("AM") && hrVal == 12){
            hrVal = hrVal-12;
        }

        if(s.contains("PM") && hrVal < 12){
            hrVal =hrVal+12;
        }
        hr = String.valueOf(hrVal);
        if(hr.length()<2){
            hr = "0"+hr;
        }
        output = hr+builderStringConverter;
      return output;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ParseException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String s = scan.nextLine();
        String s = "02:05:45AM";
        String result = timeConversion(s);
        System.out.println("res: "+result);

//        bw.write(result);
//        bw.newLine();
//
//        bw.close();
    }
}

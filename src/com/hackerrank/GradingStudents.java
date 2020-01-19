package com.hackerrank;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

 class Result {


    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> gradeList = new LinkedList<>();
        for(int grade : grades){
            System.out.println("grade: "+grade);
            if(grade < 38 || isRemainingValueGreaterThenCondition(grade)){
                gradeList.add(grade);
            }else {
                int gradeRoundOffmultiplier = ((grade/5)+1)*5;
                System.out.println("gradeRoundOffmultiplier: "+gradeRoundOffmultiplier);
//                int gradeEq = (gradeRoundOffmultiplier*5);
//                if(((gradeEq-grade)<3) && ((gradeEq-grade)>=0)){
                    if(gradeRoundOffmultiplier <= 100) {
                        gradeList.add(gradeRoundOffmultiplier);
                    }else {
                        gradeList.add(100);
                    }


            }

        }

        return gradeList;
    }

     private static boolean isRemainingValueGreaterThenCondition(int grade) {
         int gradeRoundOffmultiplier = ((grade/5)+1)*5;
         if(gradeRoundOffmultiplier - grade >= 3){
             return true;
         }
         return false;
     }

}

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = Result.gradingStudents(grades);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(Collectors.joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();


// TEST CODE
//
//
//        List<Integer> gradingList = new LinkedList<>();
//        gradingList.add(73);
//        gradingList.add(67);
//        gradingList.add(38);
//        gradingList.add(33);
//        gradingList.add(97);
//        gradingList.add(98);
//        gradingList.add(76);
//        gradingList.add(100);
//
//        List<Integer> gradeList = Result.gradingStudents(gradingList);
//
//        System.out.println("gradeList: "+gradeList);
//        System.out.println("gradingList: "+gradingList);

    }
}

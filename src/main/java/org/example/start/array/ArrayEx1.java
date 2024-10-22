package org.example.start.array;

public class ArrayEx1 {

    /*
          int student1 = 90;
          int student2 = 80;
          int student3 = 70;
          int student4 = 60;
          int student5 = 50;
          int total = student1 + student2 + student3 + student4 + student5;
          double average = (double) total / 5;
          System.out.println("점수 총합: " + total);
          System.out.println("점수 평균: " + average);
          해당 코드를 배열을 이용해 개선
           */
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        for (int score : students) {
            total += score;
        }
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평군: " + average);
    }

}
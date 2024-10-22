package org.example.start.array;

import java.util.Scanner;

public class ArrayEx4 {

    /*
    사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subjects = {"국", "영", "수"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력 하시오:");
            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + " 점수 :");
                score[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }
            double avarage = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점:" + total + ", 평균:" + avarage);
        }
    }

}
